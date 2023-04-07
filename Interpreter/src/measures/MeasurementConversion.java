package measures;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MeasurementConversion {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question? \n(ex: 1 pint to tablespoons)");

        ConversionContext question = new ConversionContext(questionAsked);
        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();

        try {
            Class tempClass = Class.forName("measures." + fromConversion);
            Constructor con = tempClass.getConstructor();
            Object convertFrom = con.newInstance();
            Class[] methodParams = new Class[]{Double.TYPE};
            Method conversionMethod = tempClass.getDeclaredMethod(toConversion, methodParams);
            Object[] params = new Object[]{quantity};
            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQues = question.getResponse() +
                    toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQues);

            frame.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

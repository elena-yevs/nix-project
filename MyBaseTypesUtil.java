package com.nixsolutions.elenaevsiukova;

import com.nixsolutions.ppp.basetypes.BaseTypesUtil;

import java.math.BigDecimal;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyBaseTypesUtil implements BaseTypesUtil {

    private static final java.util.logging.Logger LOGGER =
            java.util.logging.Logger.getLogger(MyBaseTypesUtil.class.getName());
    private static final Logger LOG = LogManager.getLogManager().getLogger(MyBaseTypesUtil.class.getName());

    /**
     *Метод переводит число из експоненциальной записи в обычную и наоборот.
     *
     *<p>Если строка на входе является числом с плавающей точкой записанным в научной (экспоненциальной) форме,то на выходе будет это число в обчной форме.
     *
     *<p>И наоборот, если строка на входе является числом записанным к обычной форме,
     *
     *<p>то на выходе это число будет в научной (экспоненциальной). Преобразование не должно зависить от локали
     *
     * <p>и результирующая строка должна соответсвовать требованиям спецификации языка для числовых литералов.
     *
     *<p>При преобразовании сохранять не более 16 цифр после запятой.
     * @param str
     * @return
     */
    @Override
    public String toggleScientificNotation(String str) {
        BigDecimal bigNumber = new BigDecimal("5496702324E+12");
        LOG.info(bigNumber.toBigInteger());
        return null;
    }

    /**
     *
     * @param array
     * @return
     */
    @Override
    public int[] sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
        }
        return new int[0];
        }


    /**
     *Метод расчитывает среднее арифметическое значений всех элементов массива.
     * @param array
     * @return
     */
    @Override
    public float arithmeticMean(int[] array) {
        float sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        sum=sum/ array.length;
        LOG.info(String.valueOf(sum));
        return 0;
    }

    /**
     *Метод форматирует число с плавающей точкой в соответсвии с локалью для указанного языка.
     *
     * @param n -  число для форматирования
     * @param language – двухбуквенный или трехбуквенный код языка соответсвующий ISO 639
     * @return
     */
    @Override
    public String format(double n, String language) {
        LOG.info(String.format("hello %f", 456.76));
        return null;
    }
    /**
     * Метод сложения двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен зависить от локали и должен соответсвовать
     *
     * <p>требованиям спецификации языка для числовых литералов.
     *
     * @param value1  первое слагаемое, неизменяемое большое десятичное число.
     * @param value2 второе слагаемое, неизменяемое большое десятичное число.
     * @return sumOfTotal - сумма двух чисел.
     */
    @Override
    public String plus(String value1, String value2) {
        BigDecimal firstAddend = new BigDecimal(value1);
        BigDecimal secondAddend= new BigDecimal(value1);
        BigDecimal sumOfTotal = firstAddend.add(secondAddend);
        sumOfTotal.toString();
        LOG.info(String.valueOf(sumOfTotal));
        return null;
    }
    /**
     * Метод вычитания двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * @param value1    уменьшаемое, число от которого отнимаем.
     * @param value2 вычитаемое, число, которое отнимаем от уменьшаемого.
     * @return difference - разность двух чисел.
     */
    @Override
    public String minus(String value1, String value2) {
        BigDecimal minuend = new BigDecimal(value1);
        BigDecimal subtrahend= new BigDecimal(value1);
        BigDecimal difference = minuend.subtract(subtrahend);
        difference.toString();
        LOG.info(String.valueOf(difference));
        return null;
    }
    /**
     * Метод умножения двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * @param value1   первый множитель, число с плавающей точкой.
     * @param value2 второй множитель, число с плавающей точкой.
     * @return product - произведение двух чисел.
     */
    @Override
    public String mul(String value1, String value2) {
        BigDecimal multiplier = new BigDecimal(value1);
        BigDecimal multiplicand= new BigDecimal(value1);
        BigDecimal product = multiplier.multiply(multiplicand);
        product.toString();
        LOG.info(String.valueOf(product));
        return null;
    }

    /**
     * Метод деления двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * @param value1 делимое, число, подвергаемое делению.
     * @param value2  делитель, число, на которое делим делимое.
     * @return quotient - частное, результат деления двух чисел.
     *
     * <p>Частное округляется в соответствии с режимом mode.
     */
    @Override
    public String div(String value1, String value2) {
        BigDecimal dividend = new BigDecimal(value1);
        BigDecimal divisor= new BigDecimal(value1);
        BigDecimal res = dividend.divide(divisor);
        res.toString();
        LOG.info(String.valueOf(res));
        return null;
    }
    }




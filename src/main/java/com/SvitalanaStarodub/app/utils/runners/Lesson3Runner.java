package com.SvitalanaStarodub.app.utils.runners;

import com.SvitalanaStarodub.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by user on 22.01.2017.
 */
public class Lesson3Runner {
    public static void main(String args[]) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char charVariable = 'a';
        int intVariable = 97;
        float floatVariable = 65.0f;

        primitiveConvertor.charToInt(charVariable);
        primitiveConvertor.floatToChar(floatVariable);
        primitiveConvertor.intToChar(intVariable);
    }
}

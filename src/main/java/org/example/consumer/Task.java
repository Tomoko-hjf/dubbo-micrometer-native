package org.example.consumer;

import org.apache.dubbo.config.annotation.DubboReference;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class Task implements CommandLineRunner {
    @DubboReference
    private Service service;

    @Override
    public void run(String... args) throws Exception {

        int res1 = service.testInt();
        log.info("testInt: " + res1);

        int[] res2 = service.testIntArr();
        log.info("testIntarr: " + Arrays.toString(res2));

        Integer res3 = service.testInteger();
        log.info("testInteger: " + res3);

        Integer[] res4 = service.testIntegerArr();
        log.info("testIntegerArr: " + Arrays.toString(res4));

        List<Integer> res5 = service.testIntegerList();
        log.info("testIntegerList: " + res5);

        short res5_1 = service.testShort();
        log.info("testShort: " + res5_1);

        short[] res5_2 = service.testShortArr();
        log.info("testShortArr: " + Arrays.toString(res5_2));

        Short res5_3 = service.testSShort();
        log.info("testSShort: " + res5_3);

        Short[] res5_4 = service.testSShortArr();
        log.info("testSShortArr: " + Arrays.toString(res5_4));

        List<Short> res5_5 = service.testShortList();
        log.info("testShortList: " + res5_5);

        byte res6 = service.testByte();
        log.info("testByte: " + res6);

        byte[] res7 = service.testByteArr();
        log.info("testByteArr: " + Arrays.toString(res7));

        Byte res8 = service.testBByte();
        log.info("testBByte: " + res8);

        Byte[] res9 = service.testBByteArr();
        log.info("testBByteArr: " + Arrays.toString(res9));

        ArrayList<Byte> res10 = service.testByteList();
        log.info("testByteList: " + res10);

        float res11 = service.testFloat();
        log.info("testFloat: " + res11);

        float[] res12 =  service.testFloatArr();
        log.info("testFloatArr: " + Arrays.toString(res12));

        Float res13 = service.testFFloat();
        log.info("testFFloat: " + res13);

        Float[] res14 = service.testFloatArray();
        log.info("testFloatArray: " + Arrays.toString(res14));

        List<Float> res15 = service.testFloatList();
        log.info("testFloatList: " + res15);

        boolean res16 = service.testBoolean();
        log.info("testBoolean: " + res16);

        boolean[] res17 = service.testBooleanArr();
        log.info("testBooleanArr: " + Arrays.toString(res17));

        Boolean res18 = service.testBBoolean();
        log.info("testBBoolean: " + res18);

        Boolean[] res19 = service.testBooleanArray();
        log.info("testBooleanArray: " + Arrays.toString(res19));

        List<Boolean> res20 = service.testBooleanList();
        log.info("testBooleanList: " + res20);

        char res21 = service.testChar();
        log.info("testChar: " + res21);

        char[] res22 = service.testCharArr();
        log.info("testCharArr: " + Arrays.toString(res22));

        Character res23 = service.testCharacter();
        log.info("testCharacter: " + res23);

        Character[] res24 = service.testCharacterArr();
        log.info("testCharacterArr: " + Arrays.toString(res24));

        List<Character> res25 = service.testCharacterList();
        log.info("testCharacterList: " + res25);

        List<Character[]> res26 = service.testCharacterListArr();
        log.info("testCharacterListArr: " + res26);

        String res27 = service.testString();
        log.info("testString: " + res27);

        String[] res28 = service.testStringArr();
        log.info("testStringArr: " + Arrays.toString(res28));

        List<String> res29 = service.testStringList();
        log.info("testStringList: " + res29);

        List<String[]> res30 = service.testStringListArr();
        log.info("testStringListArr: " + res30);

        String res31 = service.testNull();
        log.info("testNull: " + res31);

    }
}

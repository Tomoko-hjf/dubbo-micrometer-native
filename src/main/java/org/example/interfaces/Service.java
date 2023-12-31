package org.example.interfaces;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface Service {
    String sayHi(String name);

    List<String> testList();

    int testInt();
    int[] testIntArr();
    Integer testInteger();
    Integer[] testIntegerArr();
    List<Integer> testIntegerList();

    short testShort();
    short[] testShortArr();
    Short testSShort();
    Short[] testSShortArr();
    List<Short> testShortList();

    byte testByte();
    byte[] testByteArr();
    Byte testBByte();
    Byte[] testBByteArr();
    ArrayList<Byte> testByteList();

    float testFloat();
    float[] testFloatArr();
    Float testFFloat();
    Float[] testFloatArray();
    List<Float> testFloatList();

    boolean testBoolean();
    boolean[] testBooleanArr();
    Boolean testBBoolean();
    Boolean[] testBooleanArray();
    List<Boolean> testBooleanList();

    char testChar();
    char[] testCharArr();
    Character testCharacter();
    Character[] testCharacterArr();
    List<Character> testCharacterList();
    List<Character[]> testCharacterListArr();

    String testString();
    String[] testStringArr();
    List<String> testStringList();
    List<String[]> testStringListArr();
    String testNull();


}

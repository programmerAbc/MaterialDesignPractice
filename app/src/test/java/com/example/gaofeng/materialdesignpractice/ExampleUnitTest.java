package com.example.gaofeng.materialdesignpractice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    public static byte CheckSum(byte[] bytes, int index, int len)
    {
        byte sum = 0;
        for (int i = 0; i < len; i++)
        {
            sum += bytes[index + i];
        }
        sum = (byte)(~sum + 1);
        return sum;
    }
    @Test
    public void addition_isCorrect() throws Exception {
        final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
        final byte[] START_DEVICE_CMD = { (byte) 0x0F, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00 };
        final byte[] STOP_DEVICE_CMD = { (byte) 0x0F, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00 };
        final byte[] GET_DEVICE_INFO_CMD={ (byte) 0x0F, (byte) 0xC2, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF0 };
        byte START_CHECK_SUM=CheckSum(START_DEVICE_CMD,0,14);
        byte STOP_CHECK_SUM=CheckSum(STOP_DEVICE_CMD,0,14);
        byte GET_DEVICE_INFO_CMD_CHECK_SUM=CheckSum(GET_DEVICE_INFO_CMD,0,14);
        System.out.println(START_CHECK_SUM+"=>0x"+HEX_CHARS[(START_CHECK_SUM&0xFF)>>4]+HEX_CHARS[START_CHECK_SUM&0x0F]);
        System.out.println(STOP_CHECK_SUM+"=>0x"+HEX_CHARS[(STOP_CHECK_SUM&0xFF)>>4]+HEX_CHARS[STOP_CHECK_SUM&0x0F]);
        System.out.println(GET_DEVICE_INFO_CMD_CHECK_SUM+"=>0x"+HEX_CHARS[(GET_DEVICE_INFO_CMD_CHECK_SUM&0xFF)>>4]+HEX_CHARS[GET_DEVICE_INFO_CMD_CHECK_SUM&0x0F]);
    }
}
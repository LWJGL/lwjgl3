/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.ktx;

import org.lwjgl.util.ktx.KTX;
import org.lwjgl.util.ktx.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.ktx.KTX.*;
import static org.testng.Assert.*;

public class HelloKTX {

    public static void main(String[] args) {
        // For now just verify that both ktx and ktx_read load correctly
        System.out.println("KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL = " + KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL);

        assertNotEquals(KTX.Functions.PrintInfoForMemory, NULL);
        assertNotEquals(KTXVulkan.Functions.Texture2_GetVkFormat, NULL);

        System.out.println(Functions.Texture1_WriteKTX2ToMemory);
        System.out.println(KTX.Functions.Texture2_CompressBasis);

        // TODO: add real KTX sample
    }
}

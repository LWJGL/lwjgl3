/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.harfbuzz;

import static org.lwjgl.util.harfbuzz.HarfBuzz.*;

public class HelloHarfBuzz {

    public static void main(String[] args) {
        // For now just verify that the HarfBuzz library loads correctly
        System.out.println("Loaded HarfBuzz " + hb_version_string());

        // TODO: add real HarfBuzz sample
    }

}

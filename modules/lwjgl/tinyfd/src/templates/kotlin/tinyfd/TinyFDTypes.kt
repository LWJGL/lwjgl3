/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyfd

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.TINYFD,
        """
        Contains bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}.
        """
    )
}


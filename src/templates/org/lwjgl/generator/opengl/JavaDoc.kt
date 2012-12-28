/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import java.io.PrintWriter
import org.lwjgl.generator.*

public fun PrintWriter.printOpenGLJavaDoc(documentation: String, function: String, deprecated: Boolean) {
	val injectedJavaDoc =
		if ( deprecated )
			"<em>- This function is deprecated and unavailable in the Core profile -</em>"
		else
			link("http://www.opengl.org/sdk/docs/man/xhtml/$function.xml", "OpenGL SDK Reference")

	if ( documentation.indexOf('\n') == -1 ) {
		println("\t/**")
		println("\t * $injectedJavaDoc")
		println("\t * <p/>")
		print("\t * ")
		println(documentation.substring("\t/** ".size, documentation.size - 3))
		println("\t */")
	} else {
		println("\t/**")
		println("\t * $injectedJavaDoc")
		println("\t * <p/>")
		println(documentation.substring("\t/**\n".size))
	}
}
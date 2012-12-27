/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*

/** Marks an OpenGL function as deprecated; its function address will not be loaded in a forward-compatible context. */
public class DeprecatedGL internal(): TemplateModifier {
	class object {
		val CLASS = javaClass<DeprecatedGL>()
	}

	override val isSpecial: Boolean = false
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is NativeClassFunction )
			throw IllegalArgumentException("The deprecated modifier can only be applied on functions.")

		val func = ttype as NativeClassFunction
		if ( !func.nativeClass.postfix.isEmpty() )
			throw IllegalArgumentException("The deprecated modifier can only be applied on core functionality.")
	}
}
public val deprecatedGL: DeprecatedGL = DeprecatedGL()
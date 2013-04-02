/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*

/** Marks an OpenGL function as deprecated; its function address will not be loaded in a forward-compatible context. */
public class DeprecatedGL internal(): FunctionModifier() {
	class object: ModifierObject<DeprecatedGL> {
		override val key = javaClass<DeprecatedGL>()
	}

	override val isSpecial: Boolean = false
	override protected fun validate(func: NativeClassFunction) {
		if ( !func.nativeClass.postfix.isEmpty() )
			throw IllegalArgumentException("The deprecated modifier can only be applied on core functionality.")
	}
}
public val deprecatedGL: DeprecatedGL = DeprecatedGL()
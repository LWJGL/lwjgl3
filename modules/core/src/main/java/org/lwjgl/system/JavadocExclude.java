/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** This annotation is used by LWJGL to filter certain elements during javadoc generation. */
@Target(
	{
		ElementType.PACKAGE,
		ElementType.TYPE,
		ElementType.METHOD,
		ElementType.CONSTRUCTOR,
		ElementType.FIELD
	}
)
@Retention(RetentionPolicy.SOURCE)
@JavadocExclude
public @interface JavadocExclude {
	// TODO: Source retention, exclude from the release jars
}
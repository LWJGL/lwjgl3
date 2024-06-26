/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;

/**
 * Marks a struct/union getter as the canonical getter for the corresponding member.
 *
 * <p>The canonical getter is used to generate the default equals/hashCode/toString implementations.</p>
 *
 * <p>Only one getter per member may be marked as canonical. If the annotation is missing, the canonical getter is either the getter with the same name as the
 * member or the only getter that exists. If there are multiple getters and they all have different names than the member, then this annotation is required,
 * unless all of equals, hashCode and toString have been overriden.</p>
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMCanonical {
}

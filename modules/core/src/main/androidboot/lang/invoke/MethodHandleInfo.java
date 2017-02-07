/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.lang.invoke;

import java.lang.invoke.MethodHandles.*;
import java.lang.reflect.*;

public interface MethodHandleInfo {

    int
        REF_getField         = 1,
        REF_getStatic        = 2,
        REF_putField         = 3,
        REF_putStatic        = 4,
        REF_invokeVirtual    = 5,
        REF_invokeStatic     = 6,
        REF_invokeSpecial    = 7,
        REF_newInvokeSpecial = 8,
        REF_invokeInterface  = 9;

    int getReferenceKind();

    Class<?> getDeclaringClass();

    String getName();

    MethodType getMethodType();

    <T extends Member> T reflectAs(Class<T> expected, Lookup lookup);

    int getModifiers();

    boolean isVarArgs();

    static String referenceKindToString(int referenceKind) {
        return null;
    }

    static String toString(int kind, Class<?> defc, String name, MethodType type) {
        return null;
    }

}
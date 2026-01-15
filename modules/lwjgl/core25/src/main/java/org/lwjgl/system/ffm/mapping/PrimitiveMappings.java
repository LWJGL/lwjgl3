/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

final class PrimitiveMappings {

    private PrimitiveMappings()                                 { }

    static Mapping.Boolean create(ValueLayout.OfBoolean layout) { return new Mapping.Boolean(layout, new Mapping.Pointer(layout)); }
    static Mapping.Float create(ValueLayout.OfFloat layout)     { return new Mapping.Float(layout, new Mapping.Pointer(layout)); }
    static Mapping.Double create(ValueLayout.OfDouble layout)   { return new Mapping.Double(layout, new Mapping.Pointer(layout)); }

}
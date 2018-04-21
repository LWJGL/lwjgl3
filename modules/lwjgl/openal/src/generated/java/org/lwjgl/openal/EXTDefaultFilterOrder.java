/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code ALC_EXT_DEFAULT_FILTER_ORDER} extension.
 * 
 * <p>This extension allows the default filter order (i.e. slope) to be selected at context creation time. Attibute {@link #ALC_DEFAULT_FILTER_ORDER DEFAULT_FILTER_ORDER} can be used with a
 * value of 1 (for -6dB/oct) or 2 (for -12dB/oct).</p>
 * 
 * <p>{@link #ALC_DEFAULT_FILTER_ORDER DEFAULT_FILTER_ORDER} can also be used with {@link ALC10#alcGetIntegerv GetIntegerv} to find out the current default filter order.</p>
 */
public final class EXTDefaultFilterOrder {

    /** {@code ALC_EXT_DEFAULT_FILTER_ORDER} tokens. */
    public static final int ALC_DEFAULT_FILTER_ORDER = 0x1100;

    private EXTDefaultFilterOrder() {}

}
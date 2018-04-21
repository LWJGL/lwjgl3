/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code ALC_ENUMERATE_ALL_EXT} extension.
 * 
 * <p>The Enumerate All Extension enables the application developer to retrieve a complete list of device strings identifying all the available OpenAL
 * rendering devices and paths present on the user's PC. It works in exactly the same manner as the Enumeration Extension, but it detects additional audio
 * paths that the standard extension will ignore. For instance, it will return all the possible outputs in situations where the user has more than one
 * audio device installed, or under Windows Vista where the audio system specifies different “endpoints” for sound such as Speakers, S/PDIF, etc... If you
 * don’t require such complete control over the choice of output path, then use the standard Enumeration Extension.</p>
 */
public final class EnumerateAllExt {

    /** {@code ALC_ENUMERATE_ALL_EXT} tokens. */
    public static final int
        ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012,
        ALC_ALL_DEVICES_SPECIFIER         = 0x1013;

    private EnumerateAllExt() {}

}
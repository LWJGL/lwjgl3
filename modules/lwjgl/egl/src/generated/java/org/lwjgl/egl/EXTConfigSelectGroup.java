/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_config_select_group.txt">EXT_config_select_group</a> extension.
 * 
 * <p>This extension provides a mechanism to lower the config selection priority of the configs returned by {@link EGL10#eglChooseConfig ChooseConfig}.</p>
 * 
 * <p>A new config attribute is introduced, providing a way for the implementation to group configs into different config selection categories. The config
 * selection priorities of all the configs in one category may be higher or lower than the ones in other categories. The config selection priorities in
 * one category follow the rules of {@code eglChooseConfig}. See also {@code GLX_SGIX_visual_select_group}.</p>
 */
public final class EXTConfigSelectGroup {

    /** Accepted as a new {@code EGLConfig} attribute. */
    public static final int EGL_CONFIG_SELECT_GROUP_EXT = 0x34C0;

    private EXTConfigSelectGroup() {}

}
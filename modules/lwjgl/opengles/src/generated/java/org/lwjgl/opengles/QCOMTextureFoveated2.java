/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_texture_foveated2.txt">QCOM_texture_foveated2</a> extension.
 * 
 * <p>This extension adds a new texture parameter that specifies a pixel density below which rendering can be discarded during foveated rendering.</p>
 * 
 * <p>Requires {@link QCOMTextureFoveated QCOM_texture_foveated}.</p>
 */
public final class QCOMTextureFoveated2 {

    /**
     * Accepted as a value for {@code pname} for the {@code TexParameter{if}} and {@code TexParameter{if}v} commands and for the {@code pname} parameter of
     * {@code GetTexParameter{if}v}.
     */
    public static final int GL_TEXTURE_FOVEATED_CUTOFF_DENSITY_QCOM = 0x96A0;

    private QCOMTextureFoveated2() {}

}
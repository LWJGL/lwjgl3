/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT;

/**
 * Renderer capabilities.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_caps_t {
 *     bgfx_renderer_type_t {@link #rendererType};
 *     uint64_t {@link #supported};
 *     uint16_t {@link #vendorId};
 *     uint16_t {@link #deviceId};
 *     bool {@link #homogeneousDepth};
 *     bool {@link #originBottomLeft};
 *     uint8_t {@link #numGPUs};
 *     {@link BGFXCapsGPU bgfx_caps_gpu_t} {@link #gpu}[4];
 *     {@link BGFXCapsLimits bgfx_caps_limits_t} {@link #limits};
 *     uint16_t {@link #formats}[BGFX_TEXTURE_FORMAT_COUNT];
 * }</code></pre>
 */
@NativeType("struct bgfx_caps_t")
public class BGFXCaps extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RENDERERTYPE,
        SUPPORTED,
        VENDORID,
        DEVICEID,
        HOMOGENEOUSDEPTH,
        ORIGINBOTTOMLEFT,
        NUMGPUS,
        GPU,
        LIMITS,
        FORMATS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __array(BGFXCapsGPU.SIZEOF, BGFXCapsGPU.ALIGNOF, 4),
            __member(BGFXCapsLimits.SIZEOF, BGFXCapsLimits.ALIGNOF),
            __array(2, BGFX_TEXTURE_FORMAT_COUNT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RENDERERTYPE = layout.offsetof(0);
        SUPPORTED = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        HOMOGENEOUSDEPTH = layout.offsetof(4);
        ORIGINBOTTOMLEFT = layout.offsetof(5);
        NUMGPUS = layout.offsetof(6);
        GPU = layout.offsetof(7);
        LIMITS = layout.offsetof(8);
        FORMATS = layout.offsetof(9);
    }

    /**
     * Creates a {@code BGFXCaps} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCaps(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** renderer backend type. One of:<br><table><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_AGC RENDERER_TYPE_AGC}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_NVN RENDERER_TYPE_NVN}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td></tr></table> */
    @NativeType("bgfx_renderer_type_t")
    public int rendererType() { return nrendererType(address()); }
    /** supported functionality. One or more of:<br><table><tr><td>{@link BGFX#BGFX_CAPS_ALPHA_TO_COVERAGE CAPS_ALPHA_TO_COVERAGE}</td><td>{@link BGFX#BGFX_CAPS_BLEND_INDEPENDENT CAPS_BLEND_INDEPENDENT}</td><td>{@link BGFX#BGFX_CAPS_COMPUTE CAPS_COMPUTE}</td><td>{@link BGFX#BGFX_CAPS_CONSERVATIVE_RASTER CAPS_CONSERVATIVE_RASTER}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_DRAW_INDIRECT CAPS_DRAW_INDIRECT}</td><td>{@link BGFX#BGFX_CAPS_FRAGMENT_DEPTH CAPS_FRAGMENT_DEPTH}</td><td>{@link BGFX#BGFX_CAPS_FRAGMENT_ORDERING CAPS_FRAGMENT_ORDERING}</td><td>{@link BGFX#BGFX_CAPS_GRAPHICS_DEBUGGER CAPS_GRAPHICS_DEBUGGER}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_HDR10 CAPS_HDR10}</td><td>{@link BGFX#BGFX_CAPS_HIDPI CAPS_HIDPI}</td><td>{@link BGFX#BGFX_CAPS_IMAGE_RW CAPS_IMAGE_RW}</td><td>{@link BGFX#BGFX_CAPS_INDEX32 CAPS_INDEX32}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_INSTANCING CAPS_INSTANCING}</td><td>{@link BGFX#BGFX_CAPS_OCCLUSION_QUERY CAPS_OCCLUSION_QUERY}</td><td>{@link BGFX#BGFX_CAPS_RENDERER_MULTITHREADED CAPS_RENDERER_MULTITHREADED}</td><td>{@link BGFX#BGFX_CAPS_SWAP_CHAIN CAPS_SWAP_CHAIN}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_3D CAPS_TEXTURE_3D}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_BLIT CAPS_TEXTURE_BLIT}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_COMPARE_RESERVED CAPS_TEXTURE_COMPARE_RESERVED}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_TEXTURE_COMPARE_LEQUAL CAPS_TEXTURE_COMPARE_LEQUAL}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_COMPARE_ALL CAPS_TEXTURE_COMPARE_ALL}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_CUBE_ARRAY CAPS_TEXTURE_CUBE_ARRAY}</td><td>{@link BGFX#BGFX_CAPS_TEXTURE_DIRECT_ACCESS CAPS_TEXTURE_DIRECT_ACCESS}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_TEXTURE_READ_BACK CAPS_TEXTURE_READ_BACK}</td><td>{@link BGFX#BGFX_CAPS_VERTEX_ATTRIB_HALF CAPS_VERTEX_ATTRIB_HALF}</td><td>{@link BGFX#BGFX_CAPS_VERTEX_ATTRIB_UINT10 CAPS_VERTEX_ATTRIB_UINT10}</td><td>{@link BGFX#BGFX_CAPS_VERTEX_ID CAPS_VERTEX_ID}</td></tr><tr><td>{@link BGFX#BGFX_CAPS_VIEWPORT_LAYER_ARRAY CAPS_VIEWPORT_LAYER_ARRAY}</td></tr></table> */
    @NativeType("uint64_t")
    public long supported() { return nsupported(address()); }
    /** selected GPU vendor PCI id. One of:<br><table><tr><td>{@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE}</td><td>{@link BGFX#BGFX_PCI_ID_SOFTWARE_RASTERIZER PCI_ID_SOFTWARE_RASTERIZER}</td><td>{@link BGFX#BGFX_PCI_ID_AMD PCI_ID_AMD}</td><td>{@link BGFX#BGFX_PCI_ID_APPLE PCI_ID_APPLE}</td><td>{@link BGFX#BGFX_PCI_ID_INTEL PCI_ID_INTEL}</td></tr><tr><td>{@link BGFX#BGFX_PCI_ID_NVIDIA PCI_ID_NVIDIA}</td><td>{@link BGFX#BGFX_PCI_ID_MICROSOFT PCI_ID_MICROSOFT}</td></tr></table> */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** selected GPU device id */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }
    /** true when NDC depth is in [-1, 1] range, otherwise its [0, 1] */
    @NativeType("bool")
    public boolean homogeneousDepth() { return nhomogeneousDepth(address()); }
    /** true when NDC origin is at bottom left */
    @NativeType("bool")
    public boolean originBottomLeft() { return noriginBottomLeft(address()); }
    /** number of enumerated GPUs */
    @NativeType("uint8_t")
    public byte numGPUs() { return nnumGPUs(address()); }
    /** enumerated GPUs */
    @NativeType("bgfx_caps_gpu_t[4]")
    public BGFXCapsGPU.Buffer gpu() { return ngpu(address()); }
    /** enumerated GPUs */
    @NativeType("bgfx_caps_gpu_t")
    public BGFXCapsGPU gpu(int index) { return ngpu(address(), index); }
    /** renderer runtime limits */
    @NativeType("bgfx_caps_limits_t")
    public BGFXCapsLimits limits() { return nlimits(address()); }
    /** supported texture formats */
    @NativeType("uint16_t[BGFX_TEXTURE_FORMAT_COUNT]")
    public ShortBuffer formats() { return nformats(address()); }
    /** supported texture formats */
    @NativeType("uint16_t")
    public short formats(int index) { return nformats(address(), index); }

    // -----------------------------------

    /** Returns a new {@code BGFXCaps} instance for the specified memory address. */
    public static BGFXCaps create(long address) {
        return wrap(BGFXCaps.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCaps createSafe(long address) {
        return address == NULL ? null : wrap(BGFXCaps.class, address);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rendererType}. */
    public static int nrendererType(long struct) { return UNSAFE.getInt(null, struct + BGFXCaps.RENDERERTYPE); }
    /** Unsafe version of {@link #supported}. */
    public static long nsupported(long struct) { return UNSAFE.getLong(null, struct + BGFXCaps.SUPPORTED); }
    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return UNSAFE.getShort(null, struct + BGFXCaps.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return UNSAFE.getShort(null, struct + BGFXCaps.DEVICEID); }
    /** Unsafe version of {@link #homogeneousDepth}. */
    public static boolean nhomogeneousDepth(long struct) { return UNSAFE.getByte(null, struct + BGFXCaps.HOMOGENEOUSDEPTH) != 0; }
    /** Unsafe version of {@link #originBottomLeft}. */
    public static boolean noriginBottomLeft(long struct) { return UNSAFE.getByte(null, struct + BGFXCaps.ORIGINBOTTOMLEFT) != 0; }
    /** Unsafe version of {@link #numGPUs}. */
    public static byte nnumGPUs(long struct) { return UNSAFE.getByte(null, struct + BGFXCaps.NUMGPUS); }
    /** Unsafe version of {@link #gpu}. */
    public static BGFXCapsGPU.Buffer ngpu(long struct) { return BGFXCapsGPU.create(struct + BGFXCaps.GPU, Byte.toUnsignedInt(nnumGPUs(struct))); }
    /** Unsafe version of {@link #gpu(int) gpu}. */
    public static BGFXCapsGPU ngpu(long struct, int index) {
        return BGFXCapsGPU.create(struct + BGFXCaps.GPU + check(index, Byte.toUnsignedInt(nnumGPUs(struct))) * BGFXCapsGPU.SIZEOF);
    }
    /** Unsafe version of {@link #limits}. */
    public static BGFXCapsLimits nlimits(long struct) { return BGFXCapsLimits.create(struct + BGFXCaps.LIMITS); }
    /** Unsafe version of {@link #formats}. */
    public static ShortBuffer nformats(long struct) { return memShortBuffer(struct + BGFXCaps.FORMATS, BGFX_TEXTURE_FORMAT_COUNT); }
    /** Unsafe version of {@link #formats(int) formats}. */
    public static short nformats(long struct, int index) {
        return UNSAFE.getShort(null, struct + BGFXCaps.FORMATS + check(index, BGFX_TEXTURE_FORMAT_COUNT) * 2);
    }

}
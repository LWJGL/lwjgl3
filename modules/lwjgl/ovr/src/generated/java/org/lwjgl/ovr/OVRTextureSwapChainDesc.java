/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Description used to create a texture swap chain.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTextureSwapChainDesc {
 *     ovrTextureType {@link #Type};
 *     ovrTextureFormat {@link #Format};
 *     int {@link #ArraySize};
 *     int Width;
 *     int Height;
 *     int MipLevels;
 *     int SampleCount;
 *     ovrBool {@link #StaticImage};
 *     unsigned int {@link #MiscFlags};
 *     unsigned int {@link #BindFlags};
 * }</code></pre>
 */
@NativeType("struct ovrTextureSwapChainDesc")
public class OVRTextureSwapChainDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FORMAT,
        ARRAYSIZE,
        WIDTH,
        HEIGHT,
        MIPLEVELS,
        SAMPLECOUNT,
        STATICIMAGE,
        MISCFLAGS,
        BINDFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        ARRAYSIZE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
        MIPLEVELS = layout.offsetof(5);
        SAMPLECOUNT = layout.offsetof(6);
        STATICIMAGE = layout.offsetof(7);
        MISCFLAGS = layout.offsetof(8);
        BINDFLAGS = layout.offsetof(9);
    }

    /**
     * Creates a {@code OVRTextureSwapChainDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTextureSwapChainDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** one of:<br><table><tr><td>{@link OVR#ovrTexture_2D Texture_2D}</td><td>{@link OVR#ovrTexture_Cube Texture_Cube}</td></tr></table> */
    @NativeType("ovrTextureType")
    public int Type() { return nType(address()); }
    /** one of:<br><table><tr><td>{@link OVR#OVR_FORMAT_UNKNOWN}</td><td>{@link OVR#OVR_FORMAT_B5G6R5_UNORM}</td><td>{@link OVR#OVR_FORMAT_B5G5R5A1_UNORM}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B4G4R4A4_UNORM}</td><td>{@link OVR#OVR_FORMAT_R8G8B8A8_UNORM}</td><td>{@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B8G8R8A8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8A8_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_B8G8R8X8_UNORM}</td><td>{@link OVR#OVR_FORMAT_B8G8R8X8_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_R16G16B16A16_FLOAT}</td></tr><tr><td>{@link OVR#OVR_FORMAT_R11G11B10_FLOAT}</td><td>{@link OVR#OVR_FORMAT_D16_UNORM}</td><td>{@link OVR#OVR_FORMAT_D24_UNORM_S8_UINT}</td></tr><tr><td>{@link OVR#OVR_FORMAT_D32_FLOAT}</td><td>{@link OVR#OVR_FORMAT_D32_FLOAT_S8X24_UINT}</td><td>{@link OVR#OVR_FORMAT_BC1_UNORM}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC1_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_BC2_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC2_UNORM_SRGB}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC3_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC3_UNORM_SRGB}</td><td>{@link OVR#OVR_FORMAT_BC6H_UF16}</td></tr><tr><td>{@link OVR#OVR_FORMAT_BC6H_SF16}</td><td>{@link OVR#OVR_FORMAT_BC7_UNORM}</td><td>{@link OVR#OVR_FORMAT_BC7_UNORM_SRGB}</td></tr></table> */
    @NativeType("ovrTextureFormat")
    public int Format() { return nFormat(address()); }
    /** must be 6 for {@link OVR#ovrTexture_Cube Texture_Cube}, size of texture array otherwise */
    public int ArraySize() { return nArraySize(address()); }
    /** @return the value of the {@code Width} field. */
    public int Width() { return nWidth(address()); }
    /** @return the value of the {@code Height} field. */
    public int Height() { return nHeight(address()); }
    /** @return the value of the {@code MipLevels} field. */
    public int MipLevels() { return nMipLevels(address()); }
    /** @return the value of the {@code SampleCount} field. */
    public int SampleCount() { return nSampleCount(address()); }
    /** not buffered in a chain. For images that don't change */
    @NativeType("ovrBool")
    public boolean StaticImage() { return nStaticImage(address()); }
    /** {@code ovrTextureFlags}. One or more of:<br><table><tr><td>{@link OVR#ovrTextureMisc_None TextureMisc_None}</td><td>{@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless}</td><td>{@link OVR#ovrTextureMisc_AllowGenerateMips TextureMisc_AllowGenerateMips}</td></tr><tr><td>{@link OVR#ovrTextureMisc_ProtectedContent TextureMisc_ProtectedContent}</td><td>{@link OVR#ovrTextureMisc_AutoGenerateMips TextureMisc_AutoGenerateMips}</td></tr></table> */
    @NativeType("unsigned int")
    public int MiscFlags() { return nMiscFlags(address()); }
    /** {@code ovrTextureBindFlags}. Not used for GL. One or more of:<br><table><tr><td>{@link OVR#ovrTextureBind_None TextureBind_None}</td><td>{@link OVR#ovrTextureBind_DX_RenderTarget TextureBind_DX_RenderTarget}</td><td>{@link OVR#ovrTextureBind_DX_UnorderedAccess TextureBind_DX_UnorderedAccess}</td></tr><tr><td>{@link OVR#ovrTextureBind_DX_DepthStencil TextureBind_DX_DepthStencil}</td></tr></table> */
    @NativeType("unsigned int")
    public int BindFlags() { return nBindFlags(address()); }

    /** Sets the specified value to the {@link #Type} field. */
    public OVRTextureSwapChainDesc Type(@NativeType("ovrTextureType") int value) { nType(address(), value); return this; }
    /** Sets the specified value to the {@link #Format} field. */
    public OVRTextureSwapChainDesc Format(@NativeType("ovrTextureFormat") int value) { nFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #ArraySize} field. */
    public OVRTextureSwapChainDesc ArraySize(int value) { nArraySize(address(), value); return this; }
    /** Sets the specified value to the {@code Width} field. */
    public OVRTextureSwapChainDesc Width(int value) { nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code Height} field. */
    public OVRTextureSwapChainDesc Height(int value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code MipLevels} field. */
    public OVRTextureSwapChainDesc MipLevels(int value) { nMipLevels(address(), value); return this; }
    /** Sets the specified value to the {@code SampleCount} field. */
    public OVRTextureSwapChainDesc SampleCount(int value) { nSampleCount(address(), value); return this; }
    /** Sets the specified value to the {@link #StaticImage} field. */
    public OVRTextureSwapChainDesc StaticImage(@NativeType("ovrBool") boolean value) { nStaticImage(address(), value); return this; }
    /** Sets the specified value to the {@link #MiscFlags} field. */
    public OVRTextureSwapChainDesc MiscFlags(@NativeType("unsigned int") int value) { nMiscFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #BindFlags} field. */
    public OVRTextureSwapChainDesc BindFlags(@NativeType("unsigned int") int value) { nBindFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRTextureSwapChainDesc set(
        int Type,
        int Format,
        int ArraySize,
        int Width,
        int Height,
        int MipLevels,
        int SampleCount,
        boolean StaticImage,
        int MiscFlags,
        int BindFlags
    ) {
        Type(Type);
        Format(Format);
        ArraySize(ArraySize);
        Width(Width);
        Height(Height);
        MipLevels(MipLevels);
        SampleCount(SampleCount);
        StaticImage(StaticImage);
        MiscFlags(MiscFlags);
        BindFlags(BindFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRTextureSwapChainDesc set(OVRTextureSwapChainDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRTextureSwapChainDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTextureSwapChainDesc malloc() {
        return wrap(OVRTextureSwapChainDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRTextureSwapChainDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTextureSwapChainDesc calloc() {
        return wrap(OVRTextureSwapChainDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRTextureSwapChainDesc} instance allocated with {@link BufferUtils}. */
    public static OVRTextureSwapChainDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRTextureSwapChainDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRTextureSwapChainDesc} instance for the specified memory address. */
    public static OVRTextureSwapChainDesc create(long address) {
        return wrap(OVRTextureSwapChainDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureSwapChainDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVRTextureSwapChainDesc.class, address);
    }

    /**
     * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRTextureSwapChainDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureSwapChainDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTextureSwapChainDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRTextureSwapChainDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureSwapChainDesc malloc(MemoryStack stack) {
        return wrap(OVRTextureSwapChainDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRTextureSwapChainDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureSwapChainDesc calloc(MemoryStack stack) {
        return wrap(OVRTextureSwapChainDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureSwapChainDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureSwapChainDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Type}. */
    public static int nType(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.TYPE); }
    /** Unsafe version of {@link #Format}. */
    public static int nFormat(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.FORMAT); }
    /** Unsafe version of {@link #ArraySize}. */
    public static int nArraySize(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.ARRAYSIZE); }
    /** Unsafe version of {@link #Width}. */
    public static int nWidth(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.WIDTH); }
    /** Unsafe version of {@link #Height}. */
    public static int nHeight(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.HEIGHT); }
    /** Unsafe version of {@link #MipLevels}. */
    public static int nMipLevels(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.MIPLEVELS); }
    /** Unsafe version of {@link #SampleCount}. */
    public static int nSampleCount(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.SAMPLECOUNT); }
    /** Unsafe version of {@link #StaticImage}. */
    public static boolean nStaticImage(long struct) { return UNSAFE.getByte(null, struct + OVRTextureSwapChainDesc.STATICIMAGE) != 0; }
    /** Unsafe version of {@link #MiscFlags}. */
    public static int nMiscFlags(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.MISCFLAGS); }
    /** Unsafe version of {@link #BindFlags}. */
    public static int nBindFlags(long struct) { return UNSAFE.getInt(null, struct + OVRTextureSwapChainDesc.BINDFLAGS); }

    /** Unsafe version of {@link #Type(int) Type}. */
    public static void nType(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.TYPE, value); }
    /** Unsafe version of {@link #Format(int) Format}. */
    public static void nFormat(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.FORMAT, value); }
    /** Unsafe version of {@link #ArraySize(int) ArraySize}. */
    public static void nArraySize(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.ARRAYSIZE, value); }
    /** Unsafe version of {@link #Width(int) Width}. */
    public static void nWidth(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.WIDTH, value); }
    /** Unsafe version of {@link #Height(int) Height}. */
    public static void nHeight(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.HEIGHT, value); }
    /** Unsafe version of {@link #MipLevels(int) MipLevels}. */
    public static void nMipLevels(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.MIPLEVELS, value); }
    /** Unsafe version of {@link #SampleCount(int) SampleCount}. */
    public static void nSampleCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.SAMPLECOUNT, value); }
    /** Unsafe version of {@link #StaticImage(boolean) StaticImage}. */
    public static void nStaticImage(long struct, boolean value) { UNSAFE.putByte(null, struct + OVRTextureSwapChainDesc.STATICIMAGE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #MiscFlags(int) MiscFlags}. */
    public static void nMiscFlags(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.MISCFLAGS, value); }
    /** Unsafe version of {@link #BindFlags(int) BindFlags}. */
    public static void nBindFlags(long struct, int value) { UNSAFE.putInt(null, struct + OVRTextureSwapChainDesc.BINDFLAGS, value); }

    // -----------------------------------

    /** An array of {@link OVRTextureSwapChainDesc} structs. */
    public static class Buffer extends StructBuffer<OVRTextureSwapChainDesc, Buffer> implements NativeResource {

        private static final OVRTextureSwapChainDesc ELEMENT_FACTORY = OVRTextureSwapChainDesc.create(-1L);

        /**
         * Creates a new {@code OVRTextureSwapChainDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTextureSwapChainDesc#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected OVRTextureSwapChainDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRTextureSwapChainDesc#Type} field. */
        @NativeType("ovrTextureType")
        public int Type() { return OVRTextureSwapChainDesc.nType(address()); }
        /** @return the value of the {@link OVRTextureSwapChainDesc#Format} field. */
        @NativeType("ovrTextureFormat")
        public int Format() { return OVRTextureSwapChainDesc.nFormat(address()); }
        /** @return the value of the {@link OVRTextureSwapChainDesc#ArraySize} field. */
        public int ArraySize() { return OVRTextureSwapChainDesc.nArraySize(address()); }
        /** @return the value of the {@code Width} field. */
        public int Width() { return OVRTextureSwapChainDesc.nWidth(address()); }
        /** @return the value of the {@code Height} field. */
        public int Height() { return OVRTextureSwapChainDesc.nHeight(address()); }
        /** @return the value of the {@code MipLevels} field. */
        public int MipLevels() { return OVRTextureSwapChainDesc.nMipLevels(address()); }
        /** @return the value of the {@code SampleCount} field. */
        public int SampleCount() { return OVRTextureSwapChainDesc.nSampleCount(address()); }
        /** @return the value of the {@link OVRTextureSwapChainDesc#StaticImage} field. */
        @NativeType("ovrBool")
        public boolean StaticImage() { return OVRTextureSwapChainDesc.nStaticImage(address()); }
        /** @return the value of the {@link OVRTextureSwapChainDesc#MiscFlags} field. */
        @NativeType("unsigned int")
        public int MiscFlags() { return OVRTextureSwapChainDesc.nMiscFlags(address()); }
        /** @return the value of the {@link OVRTextureSwapChainDesc#BindFlags} field. */
        @NativeType("unsigned int")
        public int BindFlags() { return OVRTextureSwapChainDesc.nBindFlags(address()); }

        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#Type} field. */
        public OVRTextureSwapChainDesc.Buffer Type(@NativeType("ovrTextureType") int value) { OVRTextureSwapChainDesc.nType(address(), value); return this; }
        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#Format} field. */
        public OVRTextureSwapChainDesc.Buffer Format(@NativeType("ovrTextureFormat") int value) { OVRTextureSwapChainDesc.nFormat(address(), value); return this; }
        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#ArraySize} field. */
        public OVRTextureSwapChainDesc.Buffer ArraySize(int value) { OVRTextureSwapChainDesc.nArraySize(address(), value); return this; }
        /** Sets the specified value to the {@code Width} field. */
        public OVRTextureSwapChainDesc.Buffer Width(int value) { OVRTextureSwapChainDesc.nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code Height} field. */
        public OVRTextureSwapChainDesc.Buffer Height(int value) { OVRTextureSwapChainDesc.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code MipLevels} field. */
        public OVRTextureSwapChainDesc.Buffer MipLevels(int value) { OVRTextureSwapChainDesc.nMipLevels(address(), value); return this; }
        /** Sets the specified value to the {@code SampleCount} field. */
        public OVRTextureSwapChainDesc.Buffer SampleCount(int value) { OVRTextureSwapChainDesc.nSampleCount(address(), value); return this; }
        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#StaticImage} field. */
        public OVRTextureSwapChainDesc.Buffer StaticImage(@NativeType("ovrBool") boolean value) { OVRTextureSwapChainDesc.nStaticImage(address(), value); return this; }
        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#MiscFlags} field. */
        public OVRTextureSwapChainDesc.Buffer MiscFlags(@NativeType("unsigned int") int value) { OVRTextureSwapChainDesc.nMiscFlags(address(), value); return this; }
        /** Sets the specified value to the {@link OVRTextureSwapChainDesc#BindFlags} field. */
        public OVRTextureSwapChainDesc.Buffer BindFlags(@NativeType("unsigned int") int value) { OVRTextureSwapChainDesc.nBindFlags(address(), value); return this; }

    }

}
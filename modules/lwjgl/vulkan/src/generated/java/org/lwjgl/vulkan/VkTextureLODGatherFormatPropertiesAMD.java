/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL}.</li>
 * <li>{@code supportsTextureGatherLODBiasAMD} &ndash; tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@link AMDTextureGatherBiasLod VK_AMD_texture_gather_bias_lod} extension. This field is set by the implementation. User-specified value is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTextureLODGatherFormatPropertiesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 supportsTextureGatherLODBiasAMD;
 * }</code></pre>
 */
public class VkTextureLODGatherFormatPropertiesAMD extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTSTEXTUREGATHERLODBIASAMD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTSTEXTUREGATHERLODBIASAMD = layout.offsetof(2);
    }

    VkTextureLODGatherFormatPropertiesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkTextureLODGatherFormatPropertiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTextureLODGatherFormatPropertiesAMD(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code supportsTextureGatherLODBiasAMD} field. */
    @NativeType("VkBool32")
    public boolean supportsTextureGatherLODBiasAMD() { return nsupportsTextureGatherLODBiasAMD(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkTextureLODGatherFormatPropertiesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTextureLODGatherFormatPropertiesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTextureLODGatherFormatPropertiesAMD set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTextureLODGatherFormatPropertiesAMD set(VkTextureLODGatherFormatPropertiesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkTextureLODGatherFormatPropertiesAMD} instance for the specified memory address. */
    public static VkTextureLODGatherFormatPropertiesAMD create(long address) {
        return new VkTextureLODGatherFormatPropertiesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTextureLODGatherFormatPropertiesAMD createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTextureLODGatherFormatPropertiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTextureLODGatherFormatPropertiesAMD.PNEXT); }
    /** Unsafe version of {@link #supportsTextureGatherLODBiasAMD}. */
    public static int nsupportsTextureGatherLODBiasAMD(long struct) { return memGetInt(struct + VkTextureLODGatherFormatPropertiesAMD.SUPPORTSTEXTUREGATHERLODBIASAMD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTextureLODGatherFormatPropertiesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTextureLODGatherFormatPropertiesAMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkTextureLODGatherFormatPropertiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkTextureLODGatherFormatPropertiesAMD, Buffer> {

        /**
         * Creates a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTextureLODGatherFormatPropertiesAMD#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkTextureLODGatherFormatPropertiesAMD newInstance(long address) {
            return new VkTextureLODGatherFormatPropertiesAMD(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTextureLODGatherFormatPropertiesAMD.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkTextureLODGatherFormatPropertiesAMD.npNext(address()); }
        /** Returns the value of the {@code supportsTextureGatherLODBiasAMD} field. */
        @NativeType("VkBool32")
        public boolean supportsTextureGatherLODBiasAMD() { return VkTextureLODGatherFormatPropertiesAMD.nsupportsTextureGatherLODBiasAMD(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkTextureLODGatherFormatPropertiesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkTextureLODGatherFormatPropertiesAMD.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTextureLODGatherFormatPropertiesAMD.Buffer pNext(@NativeType("void *") long value) { VkTextureLODGatherFormatPropertiesAMD.npNext(address(), value); return this; }

    }

}
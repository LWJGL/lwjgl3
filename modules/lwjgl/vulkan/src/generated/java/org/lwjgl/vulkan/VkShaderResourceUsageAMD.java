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
 * Resource usage information about a particular shader within a pipeline.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkShaderStatisticsInfoAMD}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderResourceUsageAMD {
 *     uint32_t {@link #numUsedVgprs};
 *     uint32_t {@link #numUsedSgprs};
 *     uint32_t {@link #ldsSizePerLocalWorkGroup};
 *     size_t {@link #ldsUsageSizeInBytes};
 *     size_t {@link #scratchMemUsageInBytes};
 * }</code></pre>
 */
public class VkShaderResourceUsageAMD extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMUSEDVGPRS,
        NUMUSEDSGPRS,
        LDSSIZEPERLOCALWORKGROUP,
        LDSUSAGESIZEINBYTES,
        SCRATCHMEMUSAGEINBYTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMUSEDVGPRS = layout.offsetof(0);
        NUMUSEDSGPRS = layout.offsetof(1);
        LDSSIZEPERLOCALWORKGROUP = layout.offsetof(2);
        LDSUSAGESIZEINBYTES = layout.offsetof(3);
        SCRATCHMEMUSAGEINBYTES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkShaderResourceUsageAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderResourceUsageAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of vector instruction general-purpose registers used by this shader. */
    @NativeType("uint32_t")
    public int numUsedVgprs() { return nnumUsedVgprs(address()); }
    /** the number of scalar instruction general-purpose registers used by this shader. */
    @NativeType("uint32_t")
    public int numUsedSgprs() { return nnumUsedSgprs(address()); }
    /** the maximum local data store size per work group in bytes. */
    @NativeType("uint32_t")
    public int ldsSizePerLocalWorkGroup() { return nldsSizePerLocalWorkGroup(address()); }
    /** the LDS usage size in bytes per work group by this shader. */
    @NativeType("size_t")
    public long ldsUsageSizeInBytes() { return nldsUsageSizeInBytes(address()); }
    /** the scratch memory usage in bytes by this shader. */
    @NativeType("size_t")
    public long scratchMemUsageInBytes() { return nscratchMemUsageInBytes(address()); }

    // -----------------------------------

    /** Returns a new {@code VkShaderResourceUsageAMD} instance for the specified memory address. */
    public static VkShaderResourceUsageAMD create(long address) {
        return wrap(VkShaderResourceUsageAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderResourceUsageAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkShaderResourceUsageAMD.class, address);
    }

    /**
     * Create a {@link VkShaderResourceUsageAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderResourceUsageAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderResourceUsageAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numUsedVgprs}. */
    public static int nnumUsedVgprs(long struct) { return UNSAFE.getInt(null, struct + VkShaderResourceUsageAMD.NUMUSEDVGPRS); }
    /** Unsafe version of {@link #numUsedSgprs}. */
    public static int nnumUsedSgprs(long struct) { return UNSAFE.getInt(null, struct + VkShaderResourceUsageAMD.NUMUSEDSGPRS); }
    /** Unsafe version of {@link #ldsSizePerLocalWorkGroup}. */
    public static int nldsSizePerLocalWorkGroup(long struct) { return UNSAFE.getInt(null, struct + VkShaderResourceUsageAMD.LDSSIZEPERLOCALWORKGROUP); }
    /** Unsafe version of {@link #ldsUsageSizeInBytes}. */
    public static long nldsUsageSizeInBytes(long struct) { return memGetAddress(struct + VkShaderResourceUsageAMD.LDSUSAGESIZEINBYTES); }
    /** Unsafe version of {@link #scratchMemUsageInBytes}. */
    public static long nscratchMemUsageInBytes(long struct) { return memGetAddress(struct + VkShaderResourceUsageAMD.SCRATCHMEMUSAGEINBYTES); }

    // -----------------------------------

    /** An array of {@link VkShaderResourceUsageAMD} structs. */
    public static class Buffer extends StructBuffer<VkShaderResourceUsageAMD, Buffer> {

        private static final VkShaderResourceUsageAMD ELEMENT_FACTORY = VkShaderResourceUsageAMD.create(-1L);

        /**
         * Creates a new {@code VkShaderResourceUsageAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderResourceUsageAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkShaderResourceUsageAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkShaderResourceUsageAMD#numUsedVgprs} field. */
        @NativeType("uint32_t")
        public int numUsedVgprs() { return VkShaderResourceUsageAMD.nnumUsedVgprs(address()); }
        /** @return the value of the {@link VkShaderResourceUsageAMD#numUsedSgprs} field. */
        @NativeType("uint32_t")
        public int numUsedSgprs() { return VkShaderResourceUsageAMD.nnumUsedSgprs(address()); }
        /** @return the value of the {@link VkShaderResourceUsageAMD#ldsSizePerLocalWorkGroup} field. */
        @NativeType("uint32_t")
        public int ldsSizePerLocalWorkGroup() { return VkShaderResourceUsageAMD.nldsSizePerLocalWorkGroup(address()); }
        /** @return the value of the {@link VkShaderResourceUsageAMD#ldsUsageSizeInBytes} field. */
        @NativeType("size_t")
        public long ldsUsageSizeInBytes() { return VkShaderResourceUsageAMD.nldsUsageSizeInBytes(address()); }
        /** @return the value of the {@link VkShaderResourceUsageAMD#scratchMemUsageInBytes} field. */
        @NativeType("size_t")
        public long scratchMemUsageInBytes() { return VkShaderResourceUsageAMD.nscratchMemUsageInBytes(address()); }

    }

}
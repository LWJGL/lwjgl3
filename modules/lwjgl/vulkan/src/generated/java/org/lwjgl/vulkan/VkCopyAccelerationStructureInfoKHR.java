/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters for copying an acceleration structure.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code mode} <b>must</b> be {@link KHRAccelerationStructure#VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR} or {@link KHRAccelerationStructure#VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR}</li>
 * <li>The source acceleration structure {@code src} <b>must</b> have been constructed prior to the execution of this command</li>
 * <li>If {@code mode} is {@link KHRAccelerationStructure#VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR}, {@code src} <b>must</b> have been constructed with {@link KHRAccelerationStructure#VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR} in the build</li>
 * <li>The {@code buffer} used to create {@code src} <b>must</b> be bound to device memory</li>
 * <li>The {@code buffer} used to create {@code dst} <b>must</b> be bound to device memory</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
 * <li>Both of {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkCmdCopyAccelerationStructureKHR CmdCopyAccelerationStructureKHR}, {@link KHRAccelerationStructure#vkCopyAccelerationStructureKHR CopyAccelerationStructureKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyAccelerationStructureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureKHR {@link #src};
 *     VkAccelerationStructureKHR {@link #dst};
 *     VkCopyAccelerationStructureModeKHR {@link #mode};
 * }</code></pre>
 */
public class VkCopyAccelerationStructureInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRC,
        DST,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkCopyAccelerationStructureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyAccelerationStructureInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the source acceleration structure for the copy. */
    @NativeType("VkAccelerationStructureKHR")
    public long src() { return nsrc(address()); }
    /** the target acceleration structure for the copy. */
    @NativeType("VkAccelerationStructureKHR")
    public long dst() { return ndst(address()); }
    /** a {@code VkCopyAccelerationStructureModeKHR} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyAccelerationStructureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkCopyAccelerationStructureInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyAccelerationStructureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #src} field. */
    public VkCopyAccelerationStructureInfoKHR src(@NativeType("VkAccelerationStructureKHR") long value) { nsrc(address(), value); return this; }
    /** Sets the specified value to the {@link #dst} field. */
    public VkCopyAccelerationStructureInfoKHR dst(@NativeType("VkAccelerationStructureKHR") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyAccelerationStructureInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyAccelerationStructureInfoKHR set(
        int sType,
        long pNext,
        long src,
        long dst,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyAccelerationStructureInfoKHR set(VkCopyAccelerationStructureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureInfoKHR malloc() {
        return wrap(VkCopyAccelerationStructureInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureInfoKHR calloc() {
        return wrap(VkCopyAccelerationStructureInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyAccelerationStructureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyAccelerationStructureInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance for the specified memory address. */
    public static VkCopyAccelerationStructureInfoKHR create(long address) {
        return wrap(VkCopyAccelerationStructureInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyAccelerationStructureInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyAccelerationStructureInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyAccelerationStructureInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureInfoKHR malloc(MemoryStack stack) {
        return wrap(VkCopyAccelerationStructureInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureInfoKHR calloc(MemoryStack stack) {
        return wrap(VkCopyAccelerationStructureInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyAccelerationStructureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyAccelerationStructureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static long nsrc(long struct) { return UNSAFE.getLong(null, struct + VkCopyAccelerationStructureInfoKHR.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return UNSAFE.getLong(null, struct + VkCopyAccelerationStructureInfoKHR.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkCopyAccelerationStructureInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyAccelerationStructureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyAccelerationStructureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #src(long) src}. */
    public static void nsrc(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyAccelerationStructureInfoKHR.SRC, value); }
    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyAccelerationStructureInfoKHR.DST, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyAccelerationStructureInfoKHR.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyAccelerationStructureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyAccelerationStructureInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyAccelerationStructureInfoKHR ELEMENT_FACTORY = VkCopyAccelerationStructureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyAccelerationStructureInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyAccelerationStructureInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyAccelerationStructureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyAccelerationStructureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyAccelerationStructureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyAccelerationStructureInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureInfoKHR#src} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long src() { return VkCopyAccelerationStructureInfoKHR.nsrc(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureInfoKHR#dst} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long dst() { return VkCopyAccelerationStructureInfoKHR.ndst(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureInfoKHR#mode} field. */
        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() { return VkCopyAccelerationStructureInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyAccelerationStructureInfoKHR#sType} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyAccelerationStructureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@link VkCopyAccelerationStructureInfoKHR#sType} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureInfoKHR#pNext} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyAccelerationStructureInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureInfoKHR#src} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer src(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyAccelerationStructureInfoKHR.nsrc(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureInfoKHR#dst} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer dst(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyAccelerationStructureInfoKHR.ndst(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureInfoKHR#mode} field. */
        public VkCopyAccelerationStructureInfoKHR.Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureInfoKHR.nmode(address(), value); return this; }

    }

}
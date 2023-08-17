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
 * Parameters for copying a micromap.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code mode} <b>must</b> be {@link EXTOpacityMicromap#VK_COPY_MICROMAP_MODE_COMPACT_EXT COPY_MICROMAP_MODE_COMPACT_EXT} or {@link EXTOpacityMicromap#VK_COPY_MICROMAP_MODE_CLONE_EXT COPY_MICROMAP_MODE_CLONE_EXT}</li>
 * <li>The source acceleration structure {@code src} <b>must</b> have been constructed prior to the execution of this command</li>
 * <li>If {@code mode} is {@link EXTOpacityMicromap#VK_COPY_MICROMAP_MODE_COMPACT_EXT COPY_MICROMAP_MODE_COMPACT_EXT}, {@code src} <b>must</b> have been constructed with {@link EXTOpacityMicromap#VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT} in the build</li>
 * <li>The {@code buffer} used to create {@code src} <b>must</b> be bound to device memory</li>
 * <li>The {@code buffer} used to create {@code dst} <b>must</b> be bound to device memory</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code src} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
 * <li>{@code dst} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyMicromapModeEXT} value</li>
 * <li>Both of {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTOpacityMicromap#vkCmdCopyMicromapEXT CmdCopyMicromapEXT}, {@link EXTOpacityMicromap#vkCopyMicromapEXT CopyMicromapEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMicromapInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMicromapEXT {@link #src};
 *     VkMicromapEXT {@link #dst};
 *     VkCopyMicromapModeEXT {@link #mode};
 * }</code></pre>
 */
public class VkCopyMicromapInfoEXT extends Struct<VkCopyMicromapInfoEXT> implements NativeResource {

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

    protected VkCopyMicromapInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMicromapInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMicromapInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyMicromapInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMicromapInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the source micromap for the copy. */
    @NativeType("VkMicromapEXT")
    public long src() { return nsrc(address()); }
    /** the target micromap for the copy. */
    @NativeType("VkMicromapEXT")
    public long dst() { return ndst(address()); }
    /** a {@code VkCopyMicromapModeEXT} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyMicromapModeEXT")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyMicromapInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT} value to the {@link #sType} field. */
    public VkCopyMicromapInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyMicromapInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #src} field. */
    public VkCopyMicromapInfoEXT src(@NativeType("VkMicromapEXT") long value) { nsrc(address(), value); return this; }
    /** Sets the specified value to the {@link #dst} field. */
    public VkCopyMicromapInfoEXT dst(@NativeType("VkMicromapEXT") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyMicromapInfoEXT mode(@NativeType("VkCopyMicromapModeEXT") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMicromapInfoEXT set(
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
    public VkCopyMicromapInfoEXT set(VkCopyMicromapInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMicromapInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMicromapInfoEXT malloc() {
        return new VkCopyMicromapInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMicromapInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMicromapInfoEXT calloc() {
        return new VkCopyMicromapInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMicromapInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyMicromapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMicromapInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMicromapInfoEXT} instance for the specified memory address. */
    public static VkCopyMicromapInfoEXT create(long address) {
        return new VkCopyMicromapInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMicromapInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyMicromapInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyMicromapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMicromapInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMicromapInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMicromapInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMicromapInfoEXT malloc(MemoryStack stack) {
        return new VkCopyMicromapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMicromapInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMicromapInfoEXT calloc(MemoryStack stack) {
        return new VkCopyMicromapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMicromapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyMicromapInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMicromapInfoEXT.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static long nsrc(long struct) { return UNSAFE.getLong(null, struct + VkCopyMicromapInfoEXT.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return UNSAFE.getLong(null, struct + VkCopyMicromapInfoEXT.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkCopyMicromapInfoEXT.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMicromapInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMicromapInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #src(long) src}. */
    public static void nsrc(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMicromapInfoEXT.SRC, value); }
    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMicromapInfoEXT.DST, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMicromapInfoEXT.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMicromapInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCopyMicromapInfoEXT, Buffer> implements NativeResource {

        private static final VkCopyMicromapInfoEXT ELEMENT_FACTORY = VkCopyMicromapInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyMicromapInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMicromapInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMicromapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMicromapInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMicromapInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkCopyMicromapInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMicromapInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkCopyMicromapInfoEXT#src} field. */
        @NativeType("VkMicromapEXT")
        public long src() { return VkCopyMicromapInfoEXT.nsrc(address()); }
        /** @return the value of the {@link VkCopyMicromapInfoEXT#dst} field. */
        @NativeType("VkMicromapEXT")
        public long dst() { return VkCopyMicromapInfoEXT.ndst(address()); }
        /** @return the value of the {@link VkCopyMicromapInfoEXT#mode} field. */
        @NativeType("VkCopyMicromapModeEXT")
        public int mode() { return VkCopyMicromapInfoEXT.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyMicromapInfoEXT#sType} field. */
        public VkCopyMicromapInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMicromapInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT} value to the {@link VkCopyMicromapInfoEXT#sType} field. */
        public VkCopyMicromapInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT); }
        /** Sets the specified value to the {@link VkCopyMicromapInfoEXT#pNext} field. */
        public VkCopyMicromapInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyMicromapInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMicromapInfoEXT#src} field. */
        public VkCopyMicromapInfoEXT.Buffer src(@NativeType("VkMicromapEXT") long value) { VkCopyMicromapInfoEXT.nsrc(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMicromapInfoEXT#dst} field. */
        public VkCopyMicromapInfoEXT.Buffer dst(@NativeType("VkMicromapEXT") long value) { VkCopyMicromapInfoEXT.ndst(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMicromapInfoEXT#mode} field. */
        public VkCopyMicromapInfoEXT.Buffer mode(@NativeType("VkCopyMicromapModeEXT") int value) { VkCopyMicromapInfoEXT.nmode(address(), value); return this; }

    }

}
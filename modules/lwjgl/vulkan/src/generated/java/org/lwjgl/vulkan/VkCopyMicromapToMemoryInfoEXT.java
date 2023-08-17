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
 * Parameters for serializing a micromap.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The source micromap {@code src} <b>must</b> have been constructed prior to the execution of this command</li>
 * <li>The memory pointed to by {@code dst} <b>must</b> be at least as large as the serialization size of {@code src}, as reported by {@link EXTOpacityMicromap#vkWriteMicromapsPropertiesEXT WriteMicromapsPropertiesEXT} or {@link EXTOpacityMicromap#vkCmdWriteMicromapsPropertiesEXT CmdWriteMicromapsPropertiesEXT} with a query type of {@link EXTOpacityMicromap#VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}</li>
 * <li>{@code mode} <b>must</b> be {@link EXTOpacityMicromap#VK_COPY_MICROMAP_MODE_SERIALIZE_EXT COPY_MICROMAP_MODE_SERIALIZE_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code src} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyMicromapModeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressKHR}, {@link EXTOpacityMicromap#vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT}, {@link EXTOpacityMicromap#vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMicromapToMemoryInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMicromapEXT {@link #src};
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} {@link #dst};
 *     VkCopyMicromapModeEXT {@link #mode};
 * }</code></pre>
 */
public class VkCopyMicromapToMemoryInfoEXT extends Struct<VkCopyMicromapToMemoryInfoEXT> implements NativeResource {

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
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF),
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

    protected VkCopyMicromapToMemoryInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMicromapToMemoryInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMicromapToMemoryInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyMicromapToMemoryInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMicromapToMemoryInfoEXT(ByteBuffer container) {
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
    /** the source micromap for the copy */
    @NativeType("VkMicromapEXT")
    public long src() { return nsrc(address()); }
    /** the device or host address to memory which is the target for the copy */
    public VkDeviceOrHostAddressKHR dst() { return ndst(address()); }
    /** a {@code VkCopyMicromapModeEXT} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyMicromapModeEXT")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyMicromapToMemoryInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT} value to the {@link #sType} field. */
    public VkCopyMicromapToMemoryInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyMicromapToMemoryInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #src} field. */
    public VkCopyMicromapToMemoryInfoEXT src(@NativeType("VkMicromapEXT") long value) { nsrc(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link #dst} field. */
    public VkCopyMicromapToMemoryInfoEXT dst(VkDeviceOrHostAddressKHR value) { ndst(address(), value); return this; }
    /** Passes the {@link #dst} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMicromapToMemoryInfoEXT dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyMicromapToMemoryInfoEXT mode(@NativeType("VkCopyMicromapModeEXT") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMicromapToMemoryInfoEXT set(
        int sType,
        long pNext,
        long src,
        VkDeviceOrHostAddressKHR dst,
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
    public VkCopyMicromapToMemoryInfoEXT set(VkCopyMicromapToMemoryInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMicromapToMemoryInfoEXT malloc() {
        return new VkCopyMicromapToMemoryInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMicromapToMemoryInfoEXT calloc() {
        return new VkCopyMicromapToMemoryInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyMicromapToMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMicromapToMemoryInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance for the specified memory address. */
    public static VkCopyMicromapToMemoryInfoEXT create(long address) {
        return new VkCopyMicromapToMemoryInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMicromapToMemoryInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyMicromapToMemoryInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMicromapToMemoryInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMicromapToMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkCopyMicromapToMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMicromapToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMicromapToMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkCopyMicromapToMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMicromapToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMicromapToMemoryInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyMicromapToMemoryInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMicromapToMemoryInfoEXT.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static long nsrc(long struct) { return UNSAFE.getLong(null, struct + VkCopyMicromapToMemoryInfoEXT.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static VkDeviceOrHostAddressKHR ndst(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkCopyMicromapToMemoryInfoEXT.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkCopyMicromapToMemoryInfoEXT.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMicromapToMemoryInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMicromapToMemoryInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #src(long) src}. */
    public static void nsrc(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMicromapToMemoryInfoEXT.SRC, value); }
    /** Unsafe version of {@link #dst(VkDeviceOrHostAddressKHR) dst}. */
    public static void ndst(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkCopyMicromapToMemoryInfoEXT.DST, VkDeviceOrHostAddressKHR.SIZEOF); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMicromapToMemoryInfoEXT.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMicromapToMemoryInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCopyMicromapToMemoryInfoEXT, Buffer> implements NativeResource {

        private static final VkCopyMicromapToMemoryInfoEXT ELEMENT_FACTORY = VkCopyMicromapToMemoryInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyMicromapToMemoryInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMicromapToMemoryInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMicromapToMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMicromapToMemoryInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMicromapToMemoryInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkCopyMicromapToMemoryInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMicromapToMemoryInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkCopyMicromapToMemoryInfoEXT#src} field. */
        @NativeType("VkMicromapEXT")
        public long src() { return VkCopyMicromapToMemoryInfoEXT.nsrc(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@link VkCopyMicromapToMemoryInfoEXT#dst} field. */
        public VkDeviceOrHostAddressKHR dst() { return VkCopyMicromapToMemoryInfoEXT.ndst(address()); }
        /** @return the value of the {@link VkCopyMicromapToMemoryInfoEXT#mode} field. */
        @NativeType("VkCopyMicromapModeEXT")
        public int mode() { return VkCopyMicromapToMemoryInfoEXT.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyMicromapToMemoryInfoEXT#sType} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMicromapToMemoryInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT} value to the {@link VkCopyMicromapToMemoryInfoEXT#sType} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT); }
        /** Sets the specified value to the {@link VkCopyMicromapToMemoryInfoEXT#pNext} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyMicromapToMemoryInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMicromapToMemoryInfoEXT#src} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer src(@NativeType("VkMicromapEXT") long value) { VkCopyMicromapToMemoryInfoEXT.nsrc(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link VkCopyMicromapToMemoryInfoEXT#dst} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer dst(VkDeviceOrHostAddressKHR value) { VkCopyMicromapToMemoryInfoEXT.ndst(address(), value); return this; }
        /** Passes the {@link VkCopyMicromapToMemoryInfoEXT#dst} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
        /** Sets the specified value to the {@link VkCopyMicromapToMemoryInfoEXT#mode} field. */
        public VkCopyMicromapToMemoryInfoEXT.Buffer mode(@NativeType("VkCopyMicromapModeEXT") int value) { VkCopyMicromapToMemoryInfoEXT.nmode(address(), value); return this; }

    }

}
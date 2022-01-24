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
 * Structure specifying the parameters of private data slot construction.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPrivateData#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTPrivateData#vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPrivateDataSlotCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPrivateDataSlotCreateFlagsEXT {@link #flags};
 * }</code></pre>
 */
public class VkPrivateDataSlotCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPrivateDataSlotCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPrivateDataSlotCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkPrivateDataSlotCreateFlagsEXT} specifying additional parameters of the new private data slot */
    @NativeType("VkPrivateDataSlotCreateFlagsEXT")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPrivateDataSlotCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPrivateData#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPrivateDataSlotCreateInfoEXT sType$Default() { return sType(EXTPrivateData.VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPrivateDataSlotCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPrivateDataSlotCreateInfoEXT flags(@NativeType("VkPrivateDataSlotCreateFlagsEXT") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPrivateDataSlotCreateInfoEXT set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPrivateDataSlotCreateInfoEXT set(VkPrivateDataSlotCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPrivateDataSlotCreateInfoEXT malloc() {
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPrivateDataSlotCreateInfoEXT calloc() {
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPrivateDataSlotCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance for the specified memory address. */
    public static VkPrivateDataSlotCreateInfoEXT create(long address) {
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPrivateDataSlotCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPrivateDataSlotCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPrivateDataSlotCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPrivateDataSlotCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPrivateDataSlotCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPrivateDataSlotCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPrivateDataSlotCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPrivateDataSlotCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPrivateDataSlotCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPrivateDataSlotCreateInfoEXT.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPrivateDataSlotCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPrivateDataSlotCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPrivateDataSlotCreateInfoEXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPrivateDataSlotCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPrivateDataSlotCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPrivateDataSlotCreateInfoEXT ELEMENT_FACTORY = VkPrivateDataSlotCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPrivateDataSlotCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPrivateDataSlotCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPrivateDataSlotCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPrivateDataSlotCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPrivateDataSlotCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPrivateDataSlotCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPrivateDataSlotCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPrivateDataSlotCreateInfoEXT#flags} field. */
        @NativeType("VkPrivateDataSlotCreateFlagsEXT")
        public int flags() { return VkPrivateDataSlotCreateInfoEXT.nflags(address()); }

        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfoEXT#sType} field. */
        public VkPrivateDataSlotCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPrivateDataSlotCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPrivateData#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT} value to the {@link VkPrivateDataSlotCreateInfoEXT#sType} field. */
        public VkPrivateDataSlotCreateInfoEXT.Buffer sType$Default() { return sType(EXTPrivateData.VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfoEXT#pNext} field. */
        public VkPrivateDataSlotCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPrivateDataSlotCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfoEXT#flags} field. */
        public VkPrivateDataSlotCreateInfoEXT.Buffer flags(@NativeType("VkPrivateDataSlotCreateFlagsEXT") int value) { VkPrivateDataSlotCreateInfoEXT.nflags(address(), value); return this; }

    }

}
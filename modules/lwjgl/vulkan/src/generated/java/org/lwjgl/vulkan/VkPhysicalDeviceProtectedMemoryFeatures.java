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
 * Structure describing protected memory features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceProtectedMemoryFeatures} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with a value indicating whether the feature is supported.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code protectedMemory} &ndash; specifies whether protected memory is supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceProtectedMemoryFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 protectedMemory;
 * }</code></pre>
 */
public class VkPhysicalDeviceProtectedMemoryFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROTECTEDMEMORY;

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
        PROTECTEDMEMORY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProtectedMemoryFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProtectedMemoryFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code protectedMemory} field. */
    @NativeType("VkBool32")
    public boolean protectedMemory() { return nprotectedMemory(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceProtectedMemoryFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceProtectedMemoryFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code protectedMemory} field. */
    public VkPhysicalDeviceProtectedMemoryFeatures protectedMemory(@NativeType("VkBool32") boolean value) { nprotectedMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProtectedMemoryFeatures set(
        int sType,
        long pNext,
        boolean protectedMemory
    ) {
        sType(sType);
        pNext(pNext);
        protectedMemory(protectedMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceProtectedMemoryFeatures set(VkPhysicalDeviceProtectedMemoryFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProtectedMemoryFeatures malloc() {
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProtectedMemoryFeatures calloc() {
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProtectedMemoryFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceProtectedMemoryFeatures create(long address) {
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProtectedMemoryFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceProtectedMemoryFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceProtectedMemoryFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProtectedMemoryFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProtectedMemoryFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProtectedMemoryFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProtectedMemoryFeatures.PNEXT); }
    /** Unsafe version of {@link #protectedMemory}. */
    public static int nprotectedMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProtectedMemoryFeatures.PROTECTEDMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProtectedMemoryFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProtectedMemoryFeatures.PNEXT, value); }
    /** Unsafe version of {@link #protectedMemory(boolean) protectedMemory}. */
    public static void nprotectedMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProtectedMemoryFeatures.PROTECTEDMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProtectedMemoryFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProtectedMemoryFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProtectedMemoryFeatures ELEMENT_FACTORY = VkPhysicalDeviceProtectedMemoryFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProtectedMemoryFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProtectedMemoryFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceProtectedMemoryFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProtectedMemoryFeatures.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProtectedMemoryFeatures.npNext(address()); }
        /** Returns the value of the {@code protectedMemory} field. */
        @NativeType("VkBool32")
        public boolean protectedMemory() { return VkPhysicalDeviceProtectedMemoryFeatures.nprotectedMemory(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceProtectedMemoryFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProtectedMemoryFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceProtectedMemoryFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProtectedMemoryFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code protectedMemory} field. */
        public VkPhysicalDeviceProtectedMemoryFeatures.Buffer protectedMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceProtectedMemoryFeatures.nprotectedMemory(address(), value ? 1 : 0); return this; }

    }

}
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
 * Structure indicating support for scalar block layouts.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceScalarBlockLayoutFeatures} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceScalarBlockLayoutFeatures} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable this feature.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceScalarBlockLayoutFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #scalarBlockLayout};
 * }</code></pre>
 */
public class VkPhysicalDeviceScalarBlockLayoutFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCALARBLOCKLAYOUT;

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
        SCALARBLOCKLAYOUT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceScalarBlockLayoutFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the layout of resource blocks in shaders using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#interfaces-alignment-requirements">scalar alignment</a>. */
    @NativeType("VkBool32")
    public boolean scalarBlockLayout() { return nscalarBlockLayout(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceScalarBlockLayoutFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceScalarBlockLayoutFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #scalarBlockLayout} field. */
    public VkPhysicalDeviceScalarBlockLayoutFeatures scalarBlockLayout(@NativeType("VkBool32") boolean value) { nscalarBlockLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceScalarBlockLayoutFeatures set(
        int sType,
        long pNext,
        boolean scalarBlockLayout
    ) {
        sType(sType);
        pNext(pNext);
        scalarBlockLayout(scalarBlockLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceScalarBlockLayoutFeatures set(VkPhysicalDeviceScalarBlockLayoutFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures malloc() {
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures calloc() {
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures create(long address) {
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceScalarBlockLayoutFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceScalarBlockLayoutFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceScalarBlockLayoutFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceScalarBlockLayoutFeatures.PNEXT); }
    /** Unsafe version of {@link #scalarBlockLayout}. */
    public static int nscalarBlockLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceScalarBlockLayoutFeatures.SCALARBLOCKLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceScalarBlockLayoutFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceScalarBlockLayoutFeatures.PNEXT, value); }
    /** Unsafe version of {@link #scalarBlockLayout(boolean) scalarBlockLayout}. */
    public static void nscalarBlockLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceScalarBlockLayoutFeatures.SCALARBLOCKLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceScalarBlockLayoutFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceScalarBlockLayoutFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceScalarBlockLayoutFeatures ELEMENT_FACTORY = VkPhysicalDeviceScalarBlockLayoutFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceScalarBlockLayoutFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceScalarBlockLayoutFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceScalarBlockLayoutFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceScalarBlockLayoutFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceScalarBlockLayoutFeatures#scalarBlockLayout} field. */
        @NativeType("VkBool32")
        public boolean scalarBlockLayout() { return VkPhysicalDeviceScalarBlockLayoutFeatures.nscalarBlockLayout(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceScalarBlockLayoutFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceScalarBlockLayoutFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceScalarBlockLayoutFeatures#scalarBlockLayout} field. */
        public VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceScalarBlockLayoutFeatures.nscalarBlockLayout(address(), value ? 1 : 0); return this; }

    }

}
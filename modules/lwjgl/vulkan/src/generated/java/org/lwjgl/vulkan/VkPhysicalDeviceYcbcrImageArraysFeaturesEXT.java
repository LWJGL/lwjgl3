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
 * Structure describing extended Y'CbCr image creation features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTYcbcrImageArrays#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ycbcrImageArrays} &ndash; indicates that the implementation supports creating images with a format that requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">Y′C<sub>B</sub>C<sub>R</sub> conversion</a> and has multiple array layers.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceYcbcrImageArraysFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 ycbcrImageArrays;
 * }</code></pre>
 */
public class VkPhysicalDeviceYcbcrImageArraysFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        YCBCRIMAGEARRAYS;

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
        YCBCRIMAGEARRAYS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code ycbcrImageArrays} field. */
    @NativeType("VkBool32")
    public boolean ycbcrImageArrays() { return nycbcrImageArrays(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrImageArrays} field. */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArrays(@NativeType("VkBool32") boolean value) { nycbcrImageArrays(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT set(
        int sType,
        long pNext,
        boolean ycbcrImageArrays
    ) {
        sType(sType);
        pNext(pNext);
        ycbcrImageArrays(ycbcrImageArrays);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT set(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #ycbcrImageArrays}. */
    public static int nycbcrImageArrays(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.YCBCRIMAGEARRAYS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #ycbcrImageArrays(boolean) ycbcrImageArrays}. */
    public static void nycbcrImageArrays(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.YCBCRIMAGEARRAYS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceYcbcrImageArraysFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code ycbcrImageArrays} field. */
        @NativeType("VkBool32")
        public boolean ycbcrImageArrays() { return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nycbcrImageArrays(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrImageArrays} field. */
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.Buffer ycbcrImageArrays(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.nycbcrImageArrays(address(), value ? 1 : 0); return this; }

    }

}
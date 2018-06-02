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
 * Structure describing discard rectangle limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxDiscardRectangles} &ndash; the maximum number of discard rectangles that <b>can</b> be specified.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDiscardRectanglePropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxDiscardRectangles;
 * }</code></pre>
 */
public class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXDISCARDRECTANGLES;

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
        MAXDISCARDRECTANGLES = layout.offsetof(2);
    }

    VkPhysicalDeviceDiscardRectanglePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code maxDiscardRectangles} field. */
    @NativeType("uint32_t")
    public int maxDiscardRectangles() { return nmaxDiscardRectangles(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxDiscardRectangles} field. */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT maxDiscardRectangles(@NativeType("uint32_t") int value) { nmaxDiscardRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT set(
        int sType,
        long pNext,
        int maxDiscardRectangles
    ) {
        sType(sType);
        pNext(pNext);
        maxDiscardRectangles(maxDiscardRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDiscardRectanglePropertiesEXT set(VkPhysicalDeviceDiscardRectanglePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT create() {
        return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT create(long address) {
        return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxDiscardRectangles}. */
    public static int nmaxDiscardRectangles(long struct) { return memGetInt(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.MAXDISCARDRECTANGLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxDiscardRectangles(int) maxDiscardRectangles}. */
    public static void nmaxDiscardRectangles(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDiscardRectanglePropertiesEXT.MAXDISCARDRECTANGLES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDiscardRectanglePropertiesEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDiscardRectanglePropertiesEXT newInstance(long address) {
            return new VkPhysicalDeviceDiscardRectanglePropertiesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDiscardRectanglePropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDiscardRectanglePropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code maxDiscardRectangles} field. */
        @NativeType("uint32_t")
        public int maxDiscardRectangles() { return VkPhysicalDeviceDiscardRectanglePropertiesEXT.nmaxDiscardRectangles(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDiscardRectanglePropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDiscardRectanglePropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxDiscardRectangles} field. */
        public VkPhysicalDeviceDiscardRectanglePropertiesEXT.Buffer maxDiscardRectangles(@NativeType("uint32_t") int value) { VkPhysicalDeviceDiscardRectanglePropertiesEXT.nmaxDiscardRectangles(address(), value); return this; }

    }

}
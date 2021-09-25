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
 * Structure specifying supported external handle properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalMemoryProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalImageFormatProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExternalMemoryProperties VkExternalMemoryProperties} {@link #externalMemoryProperties};
 * }</code></pre>
 */
public class VkExternalImageFormatProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExternalMemoryProperties.SIZEOF, VkExternalMemoryProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExternalImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalImageFormatProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkExternalMemoryProperties} structure specifying various capabilities of the external handle type when used with the specified image creation parameters. */
    public VkExternalMemoryProperties externalMemoryProperties() { return nexternalMemoryProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExternalImageFormatProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES} value to the {@link #sType} field. */
    public VkExternalImageFormatProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExternalImageFormatProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalImageFormatProperties set(
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
    public VkExternalImageFormatProperties set(VkExternalImageFormatProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalImageFormatProperties malloc() {
        return wrap(VkExternalImageFormatProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExternalImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalImageFormatProperties calloc() {
        return wrap(VkExternalImageFormatProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExternalImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkExternalImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExternalImageFormatProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExternalImageFormatProperties} instance for the specified memory address. */
    public static VkExternalImageFormatProperties create(long address) {
        return wrap(VkExternalImageFormatProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalImageFormatProperties.class, address);
    }

    /**
     * Returns a new {@link VkExternalImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExternalImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExternalImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalImageFormatProperties malloc(MemoryStack stack) {
        return wrap(VkExternalImageFormatProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExternalImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalImageFormatProperties calloc(MemoryStack stack) {
        return wrap(VkExternalImageFormatProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalImageFormatProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalImageFormatProperties.PNEXT); }
    /** Unsafe version of {@link #externalMemoryProperties}. */
    public static VkExternalMemoryProperties nexternalMemoryProperties(long struct) { return VkExternalMemoryProperties.create(struct + VkExternalImageFormatProperties.EXTERNALMEMORYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalImageFormatProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalImageFormatProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExternalImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkExternalImageFormatProperties, Buffer> implements NativeResource {

        private static final VkExternalImageFormatProperties ELEMENT_FACTORY = VkExternalImageFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkExternalImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExternalImageFormatProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalImageFormatProperties.nsType(address()); }
        /** @return the value of the {@link VkExternalImageFormatProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalImageFormatProperties.npNext(address()); }
        /** @return a {@link VkExternalMemoryProperties} view of the {@link VkExternalImageFormatProperties#externalMemoryProperties} field. */
        public VkExternalMemoryProperties externalMemoryProperties() { return VkExternalImageFormatProperties.nexternalMemoryProperties(address()); }

        /** Sets the specified value to the {@link VkExternalImageFormatProperties#sType} field. */
        public VkExternalImageFormatProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalImageFormatProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES} value to the {@link VkExternalImageFormatProperties#sType} field. */
        public VkExternalImageFormatProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES); }
        /** Sets the specified value to the {@link VkExternalImageFormatProperties#pNext} field. */
        public VkExternalImageFormatProperties.Buffer pNext(@NativeType("void *") long value) { VkExternalImageFormatProperties.npNext(address(), value); return this; }

    }

}
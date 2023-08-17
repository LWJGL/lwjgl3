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
 * Structure that identifies the Metal objects that can be exported from Vulkan objects.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT}</li>
 * <li>If {@code exportObjectType} is not 0, {@code exportObjectType} <b>must</b> be a valid {@code VkExportMetalObjectTypeFlagBitsEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalObjectCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExportMetalObjectTypeFlagBitsEXT {@link #exportObjectType};
 * }</code></pre>
 */
public class VkExportMetalObjectCreateInfoEXT extends Struct<VkExportMetalObjectCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXPORTOBJECTTYPE;

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
        EXPORTOBJECTTYPE = layout.offsetof(2);
    }

    protected VkExportMetalObjectCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalObjectCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalObjectCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalObjectCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalObjectCreateInfoEXT(ByteBuffer container) {
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
    /** a {@code VkExportMetalObjectTypeFlagBitsEXT} indicating the type of Metal object that the application may request to be exported from the Vulkan object. */
    @NativeType("VkExportMetalObjectTypeFlagBitsEXT")
    public int exportObjectType() { return nexportObjectType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalObjectCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalObjectCreateInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalObjectCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #exportObjectType} field. */
    public VkExportMetalObjectCreateInfoEXT exportObjectType(@NativeType("VkExportMetalObjectTypeFlagBitsEXT") int value) { nexportObjectType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalObjectCreateInfoEXT set(
        int sType,
        long pNext,
        int exportObjectType
    ) {
        sType(sType);
        pNext(pNext);
        exportObjectType(exportObjectType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMetalObjectCreateInfoEXT set(VkExportMetalObjectCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectCreateInfoEXT malloc() {
        return new VkExportMetalObjectCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectCreateInfoEXT calloc() {
        return new VkExportMetalObjectCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalObjectCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalObjectCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance for the specified memory address. */
    public static VkExportMetalObjectCreateInfoEXT create(long address) {
        return new VkExportMetalObjectCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalObjectCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalObjectCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalObjectCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectCreateInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalObjectCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalObjectCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectCreateInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalObjectCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalObjectCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalObjectCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #exportObjectType}. */
    public static int nexportObjectType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalObjectCreateInfoEXT.EXPORTOBJECTTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalObjectCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalObjectCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #exportObjectType(int) exportObjectType}. */
    public static void nexportObjectType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalObjectCreateInfoEXT.EXPORTOBJECTTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkExportMetalObjectCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalObjectCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalObjectCreateInfoEXT ELEMENT_FACTORY = VkExportMetalObjectCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalObjectCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalObjectCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalObjectCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalObjectCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalObjectCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalObjectCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalObjectCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkExportMetalObjectCreateInfoEXT#exportObjectType} field. */
        @NativeType("VkExportMetalObjectTypeFlagBitsEXT")
        public int exportObjectType() { return VkExportMetalObjectCreateInfoEXT.nexportObjectType(address()); }

        /** Sets the specified value to the {@link VkExportMetalObjectCreateInfoEXT#sType} field. */
        public VkExportMetalObjectCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalObjectCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT} value to the {@link VkExportMetalObjectCreateInfoEXT#sType} field. */
        public VkExportMetalObjectCreateInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalObjectCreateInfoEXT#pNext} field. */
        public VkExportMetalObjectCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalObjectCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalObjectCreateInfoEXT#exportObjectType} field. */
        public VkExportMetalObjectCreateInfoEXT.Buffer exportObjectType(@NativeType("VkExportMetalObjectTypeFlagBitsEXT") int value) { VkExportMetalObjectCreateInfoEXT.nexportObjectType(address(), value); return this; }

    }

}
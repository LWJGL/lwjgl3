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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure that identifies a VkImage object and corresponding Metal IOSurfaceRef object to use.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code ioSurface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it will be used to underlie the {@code VkImage}. If {@code ioSurface} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the implementation will create a new {@code IOSurface} to underlie the {@code VkImage}.</p>
 * 
 * <p>If provided, the app <b>must</b> ensure that the configuration of the {@code IOSurfaceRef} object is compatible with the configuration of the {@code VkImage}. Failure to do so results in undefined behavior.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMetalIOSurfaceInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     IOSurfaceRef {@link #ioSurface};
 * }</code></pre>
 */
public class VkImportMetalIOSurfaceInfoEXT extends Struct<VkImportMetalIOSurfaceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IOSURFACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IOSURFACE = layout.offsetof(2);
    }

    protected VkImportMetalIOSurfaceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMetalIOSurfaceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImportMetalIOSurfaceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImportMetalIOSurfaceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMetalIOSurfaceInfoEXT(ByteBuffer container) {
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
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or the Metal {@code IOSurfaceRef} object that is to underlie the {@code VkImage}. */
    @NativeType("IOSurfaceRef")
    public long ioSurface() { return nioSurface(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMetalIOSurfaceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT} value to the {@link #sType} field. */
    public VkImportMetalIOSurfaceInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMetalIOSurfaceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #ioSurface} field. */
    public VkImportMetalIOSurfaceInfoEXT ioSurface(@NativeType("IOSurfaceRef") long value) { nioSurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMetalIOSurfaceInfoEXT set(
        int sType,
        long pNext,
        long ioSurface
    ) {
        sType(sType);
        pNext(pNext);
        ioSurface(ioSurface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMetalIOSurfaceInfoEXT set(VkImportMetalIOSurfaceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMetalIOSurfaceInfoEXT malloc() {
        return new VkImportMetalIOSurfaceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMetalIOSurfaceInfoEXT calloc() {
        return new VkImportMetalIOSurfaceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMetalIOSurfaceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalIOSurfaceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance for the specified memory address. */
    public static VkImportMetalIOSurfaceInfoEXT create(long address) {
        return new VkImportMetalIOSurfaceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalIOSurfaceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImportMetalIOSurfaceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalIOSurfaceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalIOSurfaceInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalIOSurfaceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMetalIOSurfaceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalIOSurfaceInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalIOSurfaceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalIOSurfaceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalIOSurfaceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMetalIOSurfaceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMetalIOSurfaceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #ioSurface}. */
    public static long nioSurface(long struct) { return memGetAddress(struct + VkImportMetalIOSurfaceInfoEXT.IOSURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMetalIOSurfaceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMetalIOSurfaceInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #ioSurface(long) ioSurface}. */
    public static void nioSurface(long struct, long value) { memPutAddress(struct + VkImportMetalIOSurfaceInfoEXT.IOSURFACE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMetalIOSurfaceInfoEXT.IOSURFACE));
    }

    // -----------------------------------

    /** An array of {@link VkImportMetalIOSurfaceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMetalIOSurfaceInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMetalIOSurfaceInfoEXT ELEMENT_FACTORY = VkImportMetalIOSurfaceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMetalIOSurfaceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMetalIOSurfaceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMetalIOSurfaceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMetalIOSurfaceInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMetalIOSurfaceInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImportMetalIOSurfaceInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMetalIOSurfaceInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImportMetalIOSurfaceInfoEXT#ioSurface} field. */
        @NativeType("IOSurfaceRef")
        public long ioSurface() { return VkImportMetalIOSurfaceInfoEXT.nioSurface(address()); }

        /** Sets the specified value to the {@link VkImportMetalIOSurfaceInfoEXT#sType} field. */
        public VkImportMetalIOSurfaceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMetalIOSurfaceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT} value to the {@link VkImportMetalIOSurfaceInfoEXT#sType} field. */
        public VkImportMetalIOSurfaceInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImportMetalIOSurfaceInfoEXT#pNext} field. */
        public VkImportMetalIOSurfaceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMetalIOSurfaceInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMetalIOSurfaceInfoEXT#ioSurface} field. */
        public VkImportMetalIOSurfaceInfoEXT.Buffer ioSurface(@NativeType("IOSurfaceRef") long value) { VkImportMetalIOSurfaceInfoEXT.nioSurface(address(), value); return this; }

    }

}
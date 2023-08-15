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
 * Structure that identifies a VkImage object and corresponding Metal IOSurfaceRef object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT}</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalIOSurfaceInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     IOSurfaceRef {@link #ioSurface};
 * }</code></pre>
 */
public class VkExportMetalIOSurfaceInfoEXT extends Struct<VkExportMetalIOSurfaceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        IOSURFACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        IOSURFACE = layout.offsetof(3);
    }

    protected VkExportMetalIOSurfaceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalIOSurfaceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalIOSurfaceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalIOSurfaceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalIOSurfaceInfoEXT(ByteBuffer container) {
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
    /** a {@code VkImage}. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** the Metal {@code IOSurfaceRef} object underlying the {@code VkImage} object in {@code image}. The implementation will return the {@code IOSurfaceRef} in this member, or it will return {@code NULL} if no {@code IOSurfaceRef} could be found underlying the {@code VkImage} object. */
    @NativeType("IOSurfaceRef")
    public long ioSurface() { return nioSurface(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalIOSurfaceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalIOSurfaceInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalIOSurfaceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkExportMetalIOSurfaceInfoEXT image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #ioSurface} field. */
    public VkExportMetalIOSurfaceInfoEXT ioSurface(@NativeType("IOSurfaceRef") long value) { nioSurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalIOSurfaceInfoEXT set(
        int sType,
        long pNext,
        long image,
        long ioSurface
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
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
    public VkExportMetalIOSurfaceInfoEXT set(VkExportMetalIOSurfaceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalIOSurfaceInfoEXT malloc() {
        return new VkExportMetalIOSurfaceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalIOSurfaceInfoEXT calloc() {
        return new VkExportMetalIOSurfaceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalIOSurfaceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalIOSurfaceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance for the specified memory address. */
    public static VkExportMetalIOSurfaceInfoEXT create(long address) {
        return new VkExportMetalIOSurfaceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalIOSurfaceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalIOSurfaceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalIOSurfaceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalIOSurfaceInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalIOSurfaceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalIOSurfaceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalIOSurfaceInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalIOSurfaceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalIOSurfaceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalIOSurfaceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalIOSurfaceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalIOSurfaceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkExportMetalIOSurfaceInfoEXT.IMAGE); }
    /** Unsafe version of {@link #ioSurface}. */
    public static long nioSurface(long struct) { return memGetAddress(struct + VkExportMetalIOSurfaceInfoEXT.IOSURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalIOSurfaceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalIOSurfaceInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkExportMetalIOSurfaceInfoEXT.IMAGE, value); }
    /** Unsafe version of {@link #ioSurface(long) ioSurface}. */
    public static void nioSurface(long struct, long value) { memPutAddress(struct + VkExportMetalIOSurfaceInfoEXT.IOSURFACE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalIOSurfaceInfoEXT.IOSURFACE));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalIOSurfaceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalIOSurfaceInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalIOSurfaceInfoEXT ELEMENT_FACTORY = VkExportMetalIOSurfaceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalIOSurfaceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalIOSurfaceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalIOSurfaceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalIOSurfaceInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalIOSurfaceInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalIOSurfaceInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalIOSurfaceInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkExportMetalIOSurfaceInfoEXT#image} field. */
        @NativeType("VkImage")
        public long image() { return VkExportMetalIOSurfaceInfoEXT.nimage(address()); }
        /** @return the value of the {@link VkExportMetalIOSurfaceInfoEXT#ioSurface} field. */
        @NativeType("IOSurfaceRef")
        public long ioSurface() { return VkExportMetalIOSurfaceInfoEXT.nioSurface(address()); }

        /** Sets the specified value to the {@link VkExportMetalIOSurfaceInfoEXT#sType} field. */
        public VkExportMetalIOSurfaceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalIOSurfaceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT} value to the {@link VkExportMetalIOSurfaceInfoEXT#sType} field. */
        public VkExportMetalIOSurfaceInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalIOSurfaceInfoEXT#pNext} field. */
        public VkExportMetalIOSurfaceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalIOSurfaceInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalIOSurfaceInfoEXT#image} field. */
        public VkExportMetalIOSurfaceInfoEXT.Buffer image(@NativeType("VkImage") long value) { VkExportMetalIOSurfaceInfoEXT.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalIOSurfaceInfoEXT#ioSurface} field. */
        public VkExportMetalIOSurfaceInfoEXT.Buffer ioSurface(@NativeType("IOSurfaceRef") long value) { VkExportMetalIOSurfaceInfoEXT.nioSurface(address(), value); return this; }

    }

}
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
 * Structure holding available tile properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>All tiles will be tightly packed around the first tile, with edges being multiples of tile width and/or height from the origin.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Reported value for {@code apronSize} will be zero and its functionality will be described in a future extension.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMTileProperties#VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM STRUCTURE_TYPE_TILE_PROPERTIES_QCOM}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkExtent3D}, {@link VkOffset2D}, {@link QCOMTileProperties#vkGetDynamicRenderingTilePropertiesQCOM GetDynamicRenderingTilePropertiesQCOM}, {@link QCOMTileProperties#vkGetFramebufferTilePropertiesQCOM GetFramebufferTilePropertiesQCOM}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTilePropertiesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent3D VkExtent3D} {@link #tileSize};
 *     {@link VkExtent2D VkExtent2D} {@link #apronSize};
 *     {@link VkOffset2D VkOffset2D} {@link #origin};
 * }</code></pre>
 */
public class VkTilePropertiesQCOM extends Struct<VkTilePropertiesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TILESIZE,
        APRONSIZE,
        ORIGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILESIZE = layout.offsetof(2);
        APRONSIZE = layout.offsetof(3);
        ORIGIN = layout.offsetof(4);
    }

    protected VkTilePropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTilePropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkTilePropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkTilePropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTilePropertiesQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the dimensions of a tile, with width and height describing the width and height of a tile in pixels, and depth corresponding to the number of slices the tile spans. */
    public VkExtent3D tileSize() { return ntileSize(address()); }
    /** the dimension of the apron. */
    public VkExtent2D apronSize() { return napronSize(address()); }
    /** the top-left corner of the first tile in attachment space. */
    public VkOffset2D origin() { return norigin(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkTilePropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileProperties#VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM STRUCTURE_TYPE_TILE_PROPERTIES_QCOM} value to the {@link #sType} field. */
    public VkTilePropertiesQCOM sType$Default() { return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkTilePropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #tileSize} field. */
    public VkTilePropertiesQCOM tileSize(VkExtent3D value) { ntileSize(address(), value); return this; }
    /** Passes the {@link #tileSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkTilePropertiesQCOM tileSize(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(tileSize()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #apronSize} field. */
    public VkTilePropertiesQCOM apronSize(VkExtent2D value) { napronSize(address(), value); return this; }
    /** Passes the {@link #apronSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkTilePropertiesQCOM apronSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(apronSize()); return this; }
    /** Copies the specified {@link VkOffset2D} to the {@link #origin} field. */
    public VkTilePropertiesQCOM origin(VkOffset2D value) { norigin(address(), value); return this; }
    /** Passes the {@link #origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkTilePropertiesQCOM origin(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(origin()); return this; }

    /** Initializes this struct with the specified values. */
    public VkTilePropertiesQCOM set(
        int sType,
        long pNext,
        VkExtent3D tileSize,
        VkExtent2D apronSize,
        VkOffset2D origin
    ) {
        sType(sType);
        pNext(pNext);
        tileSize(tileSize);
        apronSize(apronSize);
        origin(origin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTilePropertiesQCOM set(VkTilePropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTilePropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTilePropertiesQCOM malloc() {
        return new VkTilePropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTilePropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTilePropertiesQCOM calloc() {
        return new VkTilePropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTilePropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkTilePropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTilePropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkTilePropertiesQCOM} instance for the specified memory address. */
    public static VkTilePropertiesQCOM create(long address) {
        return new VkTilePropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTilePropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkTilePropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkTilePropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTilePropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTilePropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTilePropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTilePropertiesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTilePropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTilePropertiesQCOM malloc(MemoryStack stack) {
        return new VkTilePropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTilePropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTilePropertiesQCOM calloc(MemoryStack stack) {
        return new VkTilePropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTilePropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTilePropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTilePropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkTilePropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTilePropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #tileSize}. */
    public static VkExtent3D ntileSize(long struct) { return VkExtent3D.create(struct + VkTilePropertiesQCOM.TILESIZE); }
    /** Unsafe version of {@link #apronSize}. */
    public static VkExtent2D napronSize(long struct) { return VkExtent2D.create(struct + VkTilePropertiesQCOM.APRONSIZE); }
    /** Unsafe version of {@link #origin}. */
    public static VkOffset2D norigin(long struct) { return VkOffset2D.create(struct + VkTilePropertiesQCOM.ORIGIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkTilePropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTilePropertiesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #tileSize(VkExtent3D) tileSize}. */
    public static void ntileSize(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkTilePropertiesQCOM.TILESIZE, VkExtent3D.SIZEOF); }
    /** Unsafe version of {@link #apronSize(VkExtent2D) apronSize}. */
    public static void napronSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkTilePropertiesQCOM.APRONSIZE, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #origin(VkOffset2D) origin}. */
    public static void norigin(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkTilePropertiesQCOM.ORIGIN, VkOffset2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkTilePropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkTilePropertiesQCOM, Buffer> implements NativeResource {

        private static final VkTilePropertiesQCOM ELEMENT_FACTORY = VkTilePropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkTilePropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTilePropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTilePropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkTilePropertiesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTilePropertiesQCOM.nsType(address()); }
        /** @return the value of the {@link VkTilePropertiesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkTilePropertiesQCOM.npNext(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkTilePropertiesQCOM#tileSize} field. */
        public VkExtent3D tileSize() { return VkTilePropertiesQCOM.ntileSize(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkTilePropertiesQCOM#apronSize} field. */
        public VkExtent2D apronSize() { return VkTilePropertiesQCOM.napronSize(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkTilePropertiesQCOM#origin} field. */
        public VkOffset2D origin() { return VkTilePropertiesQCOM.norigin(address()); }

        /** Sets the specified value to the {@link VkTilePropertiesQCOM#sType} field. */
        public VkTilePropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkTilePropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileProperties#VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM STRUCTURE_TYPE_TILE_PROPERTIES_QCOM} value to the {@link VkTilePropertiesQCOM#sType} field. */
        public VkTilePropertiesQCOM.Buffer sType$Default() { return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@link VkTilePropertiesQCOM#pNext} field. */
        public VkTilePropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkTilePropertiesQCOM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkTilePropertiesQCOM#tileSize} field. */
        public VkTilePropertiesQCOM.Buffer tileSize(VkExtent3D value) { VkTilePropertiesQCOM.ntileSize(address(), value); return this; }
        /** Passes the {@link VkTilePropertiesQCOM#tileSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkTilePropertiesQCOM.Buffer tileSize(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(tileSize()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkTilePropertiesQCOM#apronSize} field. */
        public VkTilePropertiesQCOM.Buffer apronSize(VkExtent2D value) { VkTilePropertiesQCOM.napronSize(address(), value); return this; }
        /** Passes the {@link VkTilePropertiesQCOM#apronSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkTilePropertiesQCOM.Buffer apronSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(apronSize()); return this; }
        /** Copies the specified {@link VkOffset2D} to the {@link VkTilePropertiesQCOM#origin} field. */
        public VkTilePropertiesQCOM.Buffer origin(VkOffset2D value) { VkTilePropertiesQCOM.norigin(address(), value); return this; }
        /** Passes the {@link VkTilePropertiesQCOM#origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkTilePropertiesQCOM.Buffer origin(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(origin()); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSurfacePresentScalingCapabilitiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPresentScalingFlagsEXT supportedPresentScaling;
 *     VkPresentGravityFlagsEXT supportedPresentGravityX;
 *     VkPresentGravityFlagsEXT supportedPresentGravityY;
 *     {@link VkExtent2D VkExtent2D} minScaledImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxScaledImageExtent;
 * }}</pre>
 */
public class VkSurfacePresentScalingCapabilitiesEXT extends Struct<VkSurfacePresentScalingCapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDPRESENTSCALING,
        SUPPORTEDPRESENTGRAVITYX,
        SUPPORTEDPRESENTGRAVITYY,
        MINSCALEDIMAGEEXTENT,
        MAXSCALEDIMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDPRESENTSCALING = layout.offsetof(2);
        SUPPORTEDPRESENTGRAVITYX = layout.offsetof(3);
        SUPPORTEDPRESENTGRAVITYY = layout.offsetof(4);
        MINSCALEDIMAGEEXTENT = layout.offsetof(5);
        MAXSCALEDIMAGEEXTENT = layout.offsetof(6);
    }

    protected VkSurfacePresentScalingCapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentScalingCapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentScalingCapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentScalingCapabilitiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code supportedPresentScaling} field. */
    @NativeType("VkPresentScalingFlagsEXT")
    public int supportedPresentScaling() { return nsupportedPresentScaling(address()); }
    /** @return the value of the {@code supportedPresentGravityX} field. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int supportedPresentGravityX() { return nsupportedPresentGravityX(address()); }
    /** @return the value of the {@code supportedPresentGravityY} field. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int supportedPresentGravityY() { return nsupportedPresentGravityY(address()); }
    /** @return a {@link VkExtent2D} view of the {@code minScaledImageExtent} field. */
    public VkExtent2D minScaledImageExtent() { return nminScaledImageExtent(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxScaledImageExtent} field. */
    public VkExtent2D maxScaledImageExtent() { return nmaxScaledImageExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfacePresentScalingCapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT} value to the {@code sType} field. */
    public VkSurfacePresentScalingCapabilitiesEXT sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentScalingCapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentScalingCapabilitiesEXT set(
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
    public VkSurfacePresentScalingCapabilitiesEXT set(VkSurfacePresentScalingCapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesEXT malloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesEXT calloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentScalingCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentScalingCapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance for the specified memory address. */
    public static VkSurfacePresentScalingCapabilitiesEXT create(long address) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentScalingCapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentScalingCapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentScalingCapabilitiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentScalingCapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #supportedPresentScaling}. */
    public static int nsupportedPresentScaling(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTSCALING); }
    /** Unsafe version of {@link #supportedPresentGravityX}. */
    public static int nsupportedPresentGravityX(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYX); }
    /** Unsafe version of {@link #supportedPresentGravityY}. */
    public static int nsupportedPresentGravityY(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYY); }
    /** Unsafe version of {@link #minScaledImageExtent}. */
    public static VkExtent2D nminScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesEXT.MINSCALEDIMAGEEXTENT); }
    /** Unsafe version of {@link #maxScaledImageExtent}. */
    public static VkExtent2D nmaxScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesEXT.MAXSCALEDIMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentScalingCapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentScalingCapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentScalingCapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentScalingCapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkSurfacePresentScalingCapabilitiesEXT ELEMENT_FACTORY = VkSurfacePresentScalingCapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentScalingCapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSurfacePresentScalingCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentScalingCapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentScalingCapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@code supportedPresentScaling} field. */
        @NativeType("VkPresentScalingFlagsEXT")
        public int supportedPresentScaling() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentScaling(address()); }
        /** @return the value of the {@code supportedPresentGravityX} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int supportedPresentGravityX() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityX(address()); }
        /** @return the value of the {@code supportedPresentGravityY} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int supportedPresentGravityY() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityY(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minScaledImageExtent} field. */
        public VkExtent2D minScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.nminScaledImageExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxScaledImageExtent} field. */
        public VkExtent2D maxScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.nmaxScaledImageExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT} value to the {@code sType} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentScalingCapabilitiesEXT.npNext(address(), value); return this; }

    }

}
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
 * struct VkSurfacePresentScalingCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPresentScalingFlagsKHR supportedPresentScaling;
 *     VkPresentGravityFlagsKHR supportedPresentGravityX;
 *     VkPresentGravityFlagsKHR supportedPresentGravityY;
 *     {@link VkExtent2D VkExtent2D} minScaledImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxScaledImageExtent;
 * }}</pre>
 */
public class VkSurfacePresentScalingCapabilitiesKHR extends Struct<VkSurfacePresentScalingCapabilitiesKHR> implements NativeResource {

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

    protected VkSurfacePresentScalingCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentScalingCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentScalingCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentScalingCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentScalingCapabilitiesKHR(ByteBuffer container) {
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
    @NativeType("VkPresentScalingFlagsKHR")
    public int supportedPresentScaling() { return nsupportedPresentScaling(address()); }
    /** @return the value of the {@code supportedPresentGravityX} field. */
    @NativeType("VkPresentGravityFlagsKHR")
    public int supportedPresentGravityX() { return nsupportedPresentGravityX(address()); }
    /** @return the value of the {@code supportedPresentGravityY} field. */
    @NativeType("VkPresentGravityFlagsKHR")
    public int supportedPresentGravityY() { return nsupportedPresentGravityY(address()); }
    /** @return a {@link VkExtent2D} view of the {@code minScaledImageExtent} field. */
    public VkExtent2D minScaledImageExtent() { return nminScaledImageExtent(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxScaledImageExtent} field. */
    public VkExtent2D maxScaledImageExtent() { return nmaxScaledImageExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfacePresentScalingCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkSurfacePresentScalingCapabilitiesKHR sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentScalingCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentScaling} field. */
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) { nsupportedPresentScaling(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentGravityX} field. */
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { nsupportedPresentGravityX(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentGravityY} field. */
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { nsupportedPresentGravityY(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code minScaledImageExtent} field. */
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(VkExtent2D value) { nminScaledImageExtent(address(), value); return this; }
    /** Passes the {@code minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code maxScaledImageExtent} field. */
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(VkExtent2D value) { nmaxScaledImageExtent(address(), value); return this; }
    /** Passes the {@code maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentScalingCapabilitiesKHR set(
        int sType,
        long pNext,
        int supportedPresentScaling,
        int supportedPresentGravityX,
        int supportedPresentGravityY,
        VkExtent2D minScaledImageExtent,
        VkExtent2D maxScaledImageExtent
    ) {
        sType(sType);
        pNext(pNext);
        supportedPresentScaling(supportedPresentScaling);
        supportedPresentGravityX(supportedPresentGravityX);
        supportedPresentGravityY(supportedPresentGravityY);
        minScaledImageExtent(minScaledImageExtent);
        maxScaledImageExtent(maxScaledImageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentScalingCapabilitiesKHR set(VkSurfacePresentScalingCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesKHR malloc() {
        return new VkSurfacePresentScalingCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesKHR calloc() {
        return new VkSurfacePresentScalingCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentScalingCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentScalingCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance for the specified memory address. */
    public static VkSurfacePresentScalingCapabilitiesKHR create(long address) {
        return new VkSurfacePresentScalingCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentScalingCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentScalingCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentScalingCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentScalingCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #supportedPresentScaling}. */
    public static int nsupportedPresentScaling(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTSCALING); }
    /** Unsafe version of {@link #supportedPresentGravityX}. */
    public static int nsupportedPresentGravityX(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTGRAVITYX); }
    /** Unsafe version of {@link #supportedPresentGravityY}. */
    public static int nsupportedPresentGravityY(long struct) { return memGetInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTGRAVITYY); }
    /** Unsafe version of {@link #minScaledImageExtent}. */
    public static VkExtent2D nminScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesKHR.MINSCALEDIMAGEEXTENT); }
    /** Unsafe version of {@link #maxScaledImageExtent}. */
    public static VkExtent2D nmaxScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesKHR.MAXSCALEDIMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentScalingCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentScalingCapabilitiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #supportedPresentScaling(int) supportedPresentScaling}. */
    public static void nsupportedPresentScaling(long struct, int value) { memPutInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTSCALING, value); }
    /** Unsafe version of {@link #supportedPresentGravityX(int) supportedPresentGravityX}. */
    public static void nsupportedPresentGravityX(long struct, int value) { memPutInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTGRAVITYX, value); }
    /** Unsafe version of {@link #supportedPresentGravityY(int) supportedPresentGravityY}. */
    public static void nsupportedPresentGravityY(long struct, int value) { memPutInt(struct + VkSurfacePresentScalingCapabilitiesKHR.SUPPORTEDPRESENTGRAVITYY, value); }
    /** Unsafe version of {@link #minScaledImageExtent(VkExtent2D) minScaledImageExtent}. */
    public static void nminScaledImageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSurfacePresentScalingCapabilitiesKHR.MINSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #maxScaledImageExtent(VkExtent2D) maxScaledImageExtent}. */
    public static void nmaxScaledImageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSurfacePresentScalingCapabilitiesKHR.MAXSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentScalingCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentScalingCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkSurfacePresentScalingCapabilitiesKHR ELEMENT_FACTORY = VkSurfacePresentScalingCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentScalingCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentScalingCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentScalingCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentScalingCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentScalingCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code supportedPresentScaling} field. */
        @NativeType("VkPresentScalingFlagsKHR")
        public int supportedPresentScaling() { return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentScaling(address()); }
        /** @return the value of the {@code supportedPresentGravityX} field. */
        @NativeType("VkPresentGravityFlagsKHR")
        public int supportedPresentGravityX() { return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityX(address()); }
        /** @return the value of the {@code supportedPresentGravityY} field. */
        @NativeType("VkPresentGravityFlagsKHR")
        public int supportedPresentGravityY() { return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityY(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minScaledImageExtent} field. */
        public VkExtent2D minScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesKHR.nminScaledImageExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxScaledImageExtent} field. */
        public VkExtent2D maxScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesKHR.nmaxScaledImageExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentScalingCapabilitiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentScaling} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentScaling(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentGravityX} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityX(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentGravityY} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityY(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code minScaledImageExtent} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer minScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesKHR.nminScaledImageExtent(address(), value); return this; }
        /** Passes the {@code minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code maxScaledImageExtent} field. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer maxScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesKHR.nmaxScaledImageExtent(address(), value); return this; }
        /** Passes the {@code maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSurfacePresentScalingCapabilitiesKHR.Buffer maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    }

}
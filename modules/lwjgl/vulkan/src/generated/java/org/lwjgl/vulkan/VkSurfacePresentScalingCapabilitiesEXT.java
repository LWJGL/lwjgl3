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
 *     VkPresentScalingFlagsKHR supportedPresentScaling;
 *     VkPresentGravityFlagsKHR supportedPresentGravityX;
 *     VkPresentGravityFlagsKHR supportedPresentGravityY;
 *     {@link VkExtent2D VkExtent2D} minScaledImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxScaledImageExtent;
 * }}</pre>
 */
public class VkSurfacePresentScalingCapabilitiesEXT extends VkSurfacePresentScalingCapabilitiesKHR {

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
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR} value to the {@code sType} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentScaling} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) { nsupportedPresentScaling(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentGravityX} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { nsupportedPresentGravityX(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPresentGravityY} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { nsupportedPresentGravityY(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code minScaledImageExtent} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(VkExtent2D value) { nminScaledImageExtent(address(), value); return this; }
    /** Passes the {@code minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code maxScaledImageExtent} field. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(VkExtent2D value) { nmaxScaledImageExtent(address(), value); return this; }
    /** Passes the {@code maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSurfacePresentScalingCapabilitiesEXT set(
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

    /** An array of {@link VkSurfacePresentScalingCapabilitiesEXT} structs. */
    public static class Buffer extends VkSurfacePresentScalingCapabilitiesKHR.Buffer {

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
            super(container);
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

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR} value to the {@code sType} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentScalingCapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentScaling} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentScaling(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentGravityX} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityX(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPresentGravityY} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityY(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code minScaledImageExtent} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer minScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesEXT.nminScaledImageExtent(address(), value); return this; }
        /** Passes the {@code minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code maxScaledImageExtent} field. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer maxScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesEXT.nmaxScaledImageExtent(address(), value); return this; }
        /** Passes the {@code maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    }

}
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
 * struct VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 attachmentFeedbackLoopDynamicState;
 * }}</pre>
 */
public class VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT extends Struct<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTFEEDBACKLOOPDYNAMICSTATE;

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
        ATTACHMENTFEEDBACKLOOPDYNAMICSTATE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code attachmentFeedbackLoopDynamicState} field. */
    @NativeType("VkBool32")
    public boolean attachmentFeedbackLoopDynamicState() { return nattachmentFeedbackLoopDynamicState(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTAttachmentFeedbackLoopDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType$Default() { return sType(EXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code attachmentFeedbackLoopDynamicState} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT attachmentFeedbackLoopDynamicState(@NativeType("VkBool32") boolean value) { nattachmentFeedbackLoopDynamicState(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(
        int sType,
        long pNext,
        boolean attachmentFeedbackLoopDynamicState
    ) {
        sType(sType);
        pNext(pNext);
        attachmentFeedbackLoopDynamicState(attachmentFeedbackLoopDynamicState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT malloc() {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT calloc() {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT create(long address) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentFeedbackLoopDynamicState}. */
    public static int nattachmentFeedbackLoopDynamicState(long struct) { return memGetInt(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.ATTACHMENTFEEDBACKLOOPDYNAMICSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #attachmentFeedbackLoopDynamicState(boolean) attachmentFeedbackLoopDynamicState}. */
    public static void nattachmentFeedbackLoopDynamicState(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.ATTACHMENTFEEDBACKLOOPDYNAMICSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code attachmentFeedbackLoopDynamicState} field. */
        @NativeType("VkBool32")
        public boolean attachmentFeedbackLoopDynamicState() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nattachmentFeedbackLoopDynamicState(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTAttachmentFeedbackLoopDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer sType$Default() { return sType(EXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code attachmentFeedbackLoopDynamicState} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer attachmentFeedbackLoopDynamicState(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nattachmentFeedbackLoopDynamicState(address(), value ? 1 : 0); return this; }

    }

}
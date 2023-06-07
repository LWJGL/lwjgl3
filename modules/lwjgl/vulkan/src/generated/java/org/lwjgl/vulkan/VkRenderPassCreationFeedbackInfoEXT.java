/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Feedback about the creation of a render pass.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreationFeedbackCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreationFeedbackInfoEXT {
 *     uint32_t {@link #postMergeSubpassCount};
 * }</code></pre>
 */
public class VkRenderPassCreationFeedbackInfoEXT extends Struct<VkRenderPassCreationFeedbackInfoEXT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSTMERGESUBPASSCOUNT;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSTMERGESUBPASSCOUNT = layout.offsetof(0);
    }

    protected VkRenderPassCreationFeedbackInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreationFeedbackInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreationFeedbackInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassCreationFeedbackInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreationFeedbackInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the subpass count after merge. */
    @NativeType("uint32_t")
    public int postMergeSubpassCount() { return npostMergeSubpassCount(address()); }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreationFeedbackInfoEXT} instance for the specified memory address. */
    public static VkRenderPassCreationFeedbackInfoEXT create(long address) {
        return new VkRenderPassCreationFeedbackInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationFeedbackInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreationFeedbackInfoEXT(address, null);
    }

    /**
     * Create a {@link VkRenderPassCreationFeedbackInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationFeedbackInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #postMergeSubpassCount}. */
    public static int npostMergeSubpassCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreationFeedbackInfoEXT.POSTMERGESUBPASSCOUNT); }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreationFeedbackInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreationFeedbackInfoEXT, Buffer> {

        private static final VkRenderPassCreationFeedbackInfoEXT ELEMENT_FACTORY = VkRenderPassCreationFeedbackInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreationFeedbackInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreationFeedbackInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreationFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassCreationFeedbackInfoEXT#postMergeSubpassCount} field. */
        @NativeType("uint32_t")
        public int postMergeSubpassCount() { return VkRenderPassCreationFeedbackInfoEXT.npostMergeSubpassCount(address()); }

    }

}
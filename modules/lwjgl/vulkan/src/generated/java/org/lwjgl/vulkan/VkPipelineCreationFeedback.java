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
 * Feedback about the creation of a pipeline or pipeline stage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VK13#VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT PIPELINE_CREATION_FEEDBACK_VALID_BIT} is not set in {@code flags}, an implementation <b>must</b> not set any other bits in {@code flags}, and the values of all other {@link VkPipelineCreationFeedback} data members are undefined.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineCreationFeedbackCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCreationFeedback {
 *     VkPipelineCreationFeedbackFlags {@link #flags};
 *     uint64_t {@link #duration};
 * }</code></pre>
 */
public class VkPipelineCreationFeedback extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        DURATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        DURATION = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkPipelineCreationFeedback} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreationFeedback(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkPipelineCreationFeedbackFlagBits} providing feedback about the creation of a pipeline or of a pipeline stage. */
    @NativeType("VkPipelineCreationFeedbackFlags")
    public int flags() { return nflags(address()); }
    /** the duration spent creating a pipeline or pipeline stage in nanoseconds. */
    @NativeType("uint64_t")
    public long duration() { return nduration(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreationFeedback} instance for the specified memory address. */
    public static VkPipelineCreationFeedback create(long address) {
        return wrap(VkPipelineCreationFeedback.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedback createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCreationFeedback.class, address);
    }

    /**
     * Create a {@link VkPipelineCreationFeedback.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedback.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedback.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCreationFeedback.FLAGS); }
    /** Unsafe version of {@link #duration}. */
    public static long nduration(long struct) { return UNSAFE.getLong(null, struct + VkPipelineCreationFeedback.DURATION); }

    // -----------------------------------

    /** An array of {@link VkPipelineCreationFeedback} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedback, Buffer> {

        private static final VkPipelineCreationFeedback ELEMENT_FACTORY = VkPipelineCreationFeedback.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreationFeedback.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreationFeedback#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCreationFeedback getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCreationFeedback#flags} field. */
        @NativeType("VkPipelineCreationFeedbackFlags")
        public int flags() { return VkPipelineCreationFeedback.nflags(address()); }
        /** @return the value of the {@link VkPipelineCreationFeedback#duration} field. */
        @NativeType("uint64_t")
        public long duration() { return VkPipelineCreationFeedback.nduration(address()); }

    }

}
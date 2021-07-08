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
 * Structure specifying parameters for the reservation of preprocess buffer space.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code maxSequencesCount} <b>must</b> be less or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectSequenceCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNV} handle</li>
 * <li>Both of {@code indirectCommandsLayout}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVDeviceGeneratedCommands#vkGetGeneratedCommandsMemoryRequirementsNV GetGeneratedCommandsMemoryRequirementsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeneratedCommandsMemoryRequirementsInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineBindPoint {@link #pipelineBindPoint};
 *     VkPipeline {@link #pipeline};
 *     VkIndirectCommandsLayoutNV {@link #indirectCommandsLayout};
 *     uint32_t {@link #maxSequencesCount};
 * }</code></pre>
 */
public class VkGeneratedCommandsMemoryRequirementsInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        PIPELINE,
        INDIRECTCOMMANDSLAYOUT,
        MAXSEQUENCESCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        MAXSEQUENCESCOUNT = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsMemoryRequirementsInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the {@code VkPipelineBindPoint} of the {@code pipeline} that this buffer memory is intended to be used with during the execution. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** the {@code VkPipeline} that this buffer memory is intended to be used with during the execution. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** the {@code VkIndirectCommandsLayoutNV} that this buffer memory is intended to be used with. */
    @NativeType("VkIndirectCommandsLayoutNV")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** the maximum number of sequences that this buffer memory in combination with the other state provided <b>can</b> be used with. */
    @NativeType("uint32_t")
    public int maxSequencesCount() { return nmaxSequencesCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBindPoint} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectCommandsLayout} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSequencesCount} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(@NativeType("uint32_t") int value) { nmaxSequencesCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        long pipeline,
        long indirectCommandsLayout,
        int maxSequencesCount
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequencesCount(maxSequencesCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(VkGeneratedCommandsMemoryRequirementsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV malloc() {
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV calloc() {
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance for the specified memory address. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV create(long address) {
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsMemoryRequirementsInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV callocStack(MemoryStack stack) {
        return wrap(VkGeneratedCommandsMemoryRequirementsInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINE); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #maxSequencesCount}. */
    public static int nmaxSequencesCount(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.MAXSEQUENCESCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINE, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #maxSequencesCount(int) maxSequencesCount}. */
    public static void nmaxSequencesCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsMemoryRequirementsInfoNV.MAXSEQUENCESCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsMemoryRequirementsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsMemoryRequirementsInfoNV, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsMemoryRequirementsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsMemoryRequirementsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsMemoryRequirementsInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGeneratedCommandsMemoryRequirementsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address()); }
        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address()); }
        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address()); }
        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address()); }
        /** @return the value of the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#maxSequencesCount} field. */
        @NativeType("uint32_t")
        public int maxSequencesCount() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address()); }

        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#sType} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pNext} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pipelineBindPoint} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#pipeline} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pipeline(@NativeType("VkPipeline") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#indirectCommandsLayout} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsMemoryRequirementsInfoNV#maxSequencesCount} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer maxSequencesCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address(), value); return this; }

    }

}
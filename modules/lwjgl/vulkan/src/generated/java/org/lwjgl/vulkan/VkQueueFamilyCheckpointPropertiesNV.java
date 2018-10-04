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
 * return structure for queue family checkpoint info query.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code checkpointExecutionStageMask} &ndash; a mask indicating which pipeline stages the implementation can execute checkpoint markers in.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyCheckpointPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineStageFlags checkpointExecutionStageMask;
 * }</code></pre>
 */
public class VkQueueFamilyCheckpointPropertiesNV extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CHECKPOINTEXECUTIONSTAGEMASK;

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
        CHECKPOINTEXECUTIONSTAGEMASK = layout.offsetof(2);
    }

    /**
     * Creates a {@link VkQueueFamilyCheckpointPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyCheckpointPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code checkpointExecutionStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int checkpointExecutionStageMask() { return ncheckpointExecutionStageMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyCheckpointPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyCheckpointPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyCheckpointPropertiesNV set(
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
    public VkQueueFamilyCheckpointPropertiesNV set(VkQueueFamilyCheckpointPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkQueueFamilyCheckpointPropertiesNV} instance for the specified memory address. */
    public static VkQueueFamilyCheckpointPropertiesNV create(long address) {
        return wrap(VkQueueFamilyCheckpointPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyCheckpointPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyCheckpointPropertiesNV.class, address);
    }

    /**
     * Create a {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyCheckpointPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyCheckpointPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #checkpointExecutionStageMask}. */
    public static int ncheckpointExecutionStageMask(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyCheckpointPropertiesNV.CHECKPOINTEXECUTIONSTAGEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyCheckpointPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyCheckpointPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyCheckpointPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyCheckpointPropertiesNV, Buffer> {

        private static final VkQueueFamilyCheckpointPropertiesNV ELEMENT_FACTORY = VkQueueFamilyCheckpointPropertiesNV.create(-1L);

        /**
         * Creates a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyCheckpointPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyCheckpointPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyCheckpointPropertiesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyCheckpointPropertiesNV.npNext(address()); }
        /** Returns the value of the {@code checkpointExecutionStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int checkpointExecutionStageMask() { return VkQueueFamilyCheckpointPropertiesNV.ncheckpointExecutionStageMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyCheckpointPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyCheckpointPropertiesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyCheckpointPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyCheckpointPropertiesNV.npNext(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct rmtVulkanFunctions {
 *     void * vkGetPhysicalDeviceProperties;
 *     void * vkQueueSubmit;
 *     void * vkQueueWaitIdle;
 *     void * vkCreateQueryPool;
 *     void * vkDestroyQueryPool;
 *     void * vkResetQueryPool;
 *     void * vkGetQueryPoolResults;
 *     void * vkCmdWriteTimestamp;
 *     void * vkCreateSemaphore;
 *     void * vkDestroySemaphore;
 *     void * vkSignalSemaphore;
 *     void * vkGetSemaphoreCounterValue;
 *     void * vkGetCalibratedTimestampsEXT;
 * }}</pre>
 */
@NativeType("struct rmtVulkanFunctions")
public class RMTVulkanFunctions extends Struct<RMTVulkanFunctions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VKGETPHYSICALDEVICEPROPERTIES,
        VKQUEUESUBMIT,
        VKQUEUEWAITIDLE,
        VKCREATEQUERYPOOL,
        VKDESTROYQUERYPOOL,
        VKRESETQUERYPOOL,
        VKGETQUERYPOOLRESULTS,
        VKCMDWRITETIMESTAMP,
        VKCREATESEMAPHORE,
        VKDESTROYSEMAPHORE,
        VKSIGNALSEMAPHORE,
        VKGETSEMAPHORECOUNTERVALUE,
        VKGETCALIBRATEDTIMESTAMPSEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VKGETPHYSICALDEVICEPROPERTIES = layout.offsetof(0);
        VKQUEUESUBMIT = layout.offsetof(1);
        VKQUEUEWAITIDLE = layout.offsetof(2);
        VKCREATEQUERYPOOL = layout.offsetof(3);
        VKDESTROYQUERYPOOL = layout.offsetof(4);
        VKRESETQUERYPOOL = layout.offsetof(5);
        VKGETQUERYPOOLRESULTS = layout.offsetof(6);
        VKCMDWRITETIMESTAMP = layout.offsetof(7);
        VKCREATESEMAPHORE = layout.offsetof(8);
        VKDESTROYSEMAPHORE = layout.offsetof(9);
        VKSIGNALSEMAPHORE = layout.offsetof(10);
        VKGETSEMAPHORECOUNTERVALUE = layout.offsetof(11);
        VKGETCALIBRATEDTIMESTAMPSEXT = layout.offsetof(12);
    }

    protected RMTVulkanFunctions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTVulkanFunctions create(long address, @Nullable ByteBuffer container) {
        return new RMTVulkanFunctions(address, container);
    }

    /**
     * Creates a {@code RMTVulkanFunctions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTVulkanFunctions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vkGetPhysicalDeviceProperties} field. */
    @NativeType("void *")
    public long vkGetPhysicalDeviceProperties() { return nvkGetPhysicalDeviceProperties(address()); }
    /** @return the value of the {@code vkQueueSubmit} field. */
    @NativeType("void *")
    public long vkQueueSubmit() { return nvkQueueSubmit(address()); }
    /** @return the value of the {@code vkQueueWaitIdle} field. */
    @NativeType("void *")
    public long vkQueueWaitIdle() { return nvkQueueWaitIdle(address()); }
    /** @return the value of the {@code vkCreateQueryPool} field. */
    @NativeType("void *")
    public long vkCreateQueryPool() { return nvkCreateQueryPool(address()); }
    /** @return the value of the {@code vkDestroyQueryPool} field. */
    @NativeType("void *")
    public long vkDestroyQueryPool() { return nvkDestroyQueryPool(address()); }
    /** @return the value of the {@code vkResetQueryPool} field. */
    @NativeType("void *")
    public long vkResetQueryPool() { return nvkResetQueryPool(address()); }
    /** @return the value of the {@code vkGetQueryPoolResults} field. */
    @NativeType("void *")
    public long vkGetQueryPoolResults() { return nvkGetQueryPoolResults(address()); }
    /** @return the value of the {@code vkCmdWriteTimestamp} field. */
    @NativeType("void *")
    public long vkCmdWriteTimestamp() { return nvkCmdWriteTimestamp(address()); }
    /** @return the value of the {@code vkCreateSemaphore} field. */
    @NativeType("void *")
    public long vkCreateSemaphore() { return nvkCreateSemaphore(address()); }
    /** @return the value of the {@code vkDestroySemaphore} field. */
    @NativeType("void *")
    public long vkDestroySemaphore() { return nvkDestroySemaphore(address()); }
    /** @return the value of the {@code vkSignalSemaphore} field. */
    @NativeType("void *")
    public long vkSignalSemaphore() { return nvkSignalSemaphore(address()); }
    /** @return the value of the {@code vkGetSemaphoreCounterValue} field. */
    @NativeType("void *")
    public long vkGetSemaphoreCounterValue() { return nvkGetSemaphoreCounterValue(address()); }
    /** @return the value of the {@code vkGetCalibratedTimestampsEXT} field. */
    @NativeType("void *")
    public long vkGetCalibratedTimestampsEXT() { return nvkGetCalibratedTimestampsEXT(address()); }

    /** Sets the specified value to the {@code vkGetPhysicalDeviceProperties} field. */
    public RMTVulkanFunctions vkGetPhysicalDeviceProperties(@NativeType("void *") long value) { nvkGetPhysicalDeviceProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkQueueSubmit} field. */
    public RMTVulkanFunctions vkQueueSubmit(@NativeType("void *") long value) { nvkQueueSubmit(address(), value); return this; }
    /** Sets the specified value to the {@code vkQueueWaitIdle} field. */
    public RMTVulkanFunctions vkQueueWaitIdle(@NativeType("void *") long value) { nvkQueueWaitIdle(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateQueryPool} field. */
    public RMTVulkanFunctions vkCreateQueryPool(@NativeType("void *") long value) { nvkCreateQueryPool(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyQueryPool} field. */
    public RMTVulkanFunctions vkDestroyQueryPool(@NativeType("void *") long value) { nvkDestroyQueryPool(address(), value); return this; }
    /** Sets the specified value to the {@code vkResetQueryPool} field. */
    public RMTVulkanFunctions vkResetQueryPool(@NativeType("void *") long value) { nvkResetQueryPool(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetQueryPoolResults} field. */
    public RMTVulkanFunctions vkGetQueryPoolResults(@NativeType("void *") long value) { nvkGetQueryPoolResults(address(), value); return this; }
    /** Sets the specified value to the {@code vkCmdWriteTimestamp} field. */
    public RMTVulkanFunctions vkCmdWriteTimestamp(@NativeType("void *") long value) { nvkCmdWriteTimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateSemaphore} field. */
    public RMTVulkanFunctions vkCreateSemaphore(@NativeType("void *") long value) { nvkCreateSemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroySemaphore} field. */
    public RMTVulkanFunctions vkDestroySemaphore(@NativeType("void *") long value) { nvkDestroySemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code vkSignalSemaphore} field. */
    public RMTVulkanFunctions vkSignalSemaphore(@NativeType("void *") long value) { nvkSignalSemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetSemaphoreCounterValue} field. */
    public RMTVulkanFunctions vkGetSemaphoreCounterValue(@NativeType("void *") long value) { nvkGetSemaphoreCounterValue(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetCalibratedTimestampsEXT} field. */
    public RMTVulkanFunctions vkGetCalibratedTimestampsEXT(@NativeType("void *") long value) { nvkGetCalibratedTimestampsEXT(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RMTVulkanFunctions set(
        long vkGetPhysicalDeviceProperties,
        long vkQueueSubmit,
        long vkQueueWaitIdle,
        long vkCreateQueryPool,
        long vkDestroyQueryPool,
        long vkResetQueryPool,
        long vkGetQueryPoolResults,
        long vkCmdWriteTimestamp,
        long vkCreateSemaphore,
        long vkDestroySemaphore,
        long vkSignalSemaphore,
        long vkGetSemaphoreCounterValue,
        long vkGetCalibratedTimestampsEXT
    ) {
        vkGetPhysicalDeviceProperties(vkGetPhysicalDeviceProperties);
        vkQueueSubmit(vkQueueSubmit);
        vkQueueWaitIdle(vkQueueWaitIdle);
        vkCreateQueryPool(vkCreateQueryPool);
        vkDestroyQueryPool(vkDestroyQueryPool);
        vkResetQueryPool(vkResetQueryPool);
        vkGetQueryPoolResults(vkGetQueryPoolResults);
        vkCmdWriteTimestamp(vkCmdWriteTimestamp);
        vkCreateSemaphore(vkCreateSemaphore);
        vkDestroySemaphore(vkDestroySemaphore);
        vkSignalSemaphore(vkSignalSemaphore);
        vkGetSemaphoreCounterValue(vkGetSemaphoreCounterValue);
        vkGetCalibratedTimestampsEXT(vkGetCalibratedTimestampsEXT);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RMTVulkanFunctions set(RMTVulkanFunctions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RMTVulkanFunctions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTVulkanFunctions malloc() {
        return new RMTVulkanFunctions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTVulkanFunctions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTVulkanFunctions calloc() {
        return new RMTVulkanFunctions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTVulkanFunctions} instance allocated with {@link BufferUtils}. */
    public static RMTVulkanFunctions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTVulkanFunctions(memAddress(container), container);
    }

    /** Returns a new {@code RMTVulkanFunctions} instance for the specified memory address. */
    public static RMTVulkanFunctions create(long address) {
        return new RMTVulkanFunctions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RMTVulkanFunctions createSafe(long address) {
        return address == NULL ? null : new RMTVulkanFunctions(address, null);
    }

    /**
     * Returns a new {@link RMTVulkanFunctions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanFunctions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanFunctions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RMTVulkanFunctions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RMTVulkanFunctions.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RMTVulkanFunctions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTVulkanFunctions malloc(MemoryStack stack) {
        return new RMTVulkanFunctions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTVulkanFunctions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTVulkanFunctions calloc(MemoryStack stack) {
        return new RMTVulkanFunctions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RMTVulkanFunctions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanFunctions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTVulkanFunctions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vkGetPhysicalDeviceProperties}. */
    public static long nvkGetPhysicalDeviceProperties(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES); }
    /** Unsafe version of {@link #vkQueueSubmit}. */
    public static long nvkQueueSubmit(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKQUEUESUBMIT); }
    /** Unsafe version of {@link #vkQueueWaitIdle}. */
    public static long nvkQueueWaitIdle(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKQUEUEWAITIDLE); }
    /** Unsafe version of {@link #vkCreateQueryPool}. */
    public static long nvkCreateQueryPool(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKCREATEQUERYPOOL); }
    /** Unsafe version of {@link #vkDestroyQueryPool}. */
    public static long nvkDestroyQueryPool(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKDESTROYQUERYPOOL); }
    /** Unsafe version of {@link #vkResetQueryPool}. */
    public static long nvkResetQueryPool(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKRESETQUERYPOOL); }
    /** Unsafe version of {@link #vkGetQueryPoolResults}. */
    public static long nvkGetQueryPoolResults(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKGETQUERYPOOLRESULTS); }
    /** Unsafe version of {@link #vkCmdWriteTimestamp}. */
    public static long nvkCmdWriteTimestamp(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKCMDWRITETIMESTAMP); }
    /** Unsafe version of {@link #vkCreateSemaphore}. */
    public static long nvkCreateSemaphore(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKCREATESEMAPHORE); }
    /** Unsafe version of {@link #vkDestroySemaphore}. */
    public static long nvkDestroySemaphore(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKDESTROYSEMAPHORE); }
    /** Unsafe version of {@link #vkSignalSemaphore}. */
    public static long nvkSignalSemaphore(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKSIGNALSEMAPHORE); }
    /** Unsafe version of {@link #vkGetSemaphoreCounterValue}. */
    public static long nvkGetSemaphoreCounterValue(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKGETSEMAPHORECOUNTERVALUE); }
    /** Unsafe version of {@link #vkGetCalibratedTimestampsEXT}. */
    public static long nvkGetCalibratedTimestampsEXT(long struct) { return memGetAddress(struct + RMTVulkanFunctions.VKGETCALIBRATEDTIMESTAMPSEXT); }

    /** Unsafe version of {@link #vkGetPhysicalDeviceProperties(long) vkGetPhysicalDeviceProperties}. */
    public static void nvkGetPhysicalDeviceProperties(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES, check(value)); }
    /** Unsafe version of {@link #vkQueueSubmit(long) vkQueueSubmit}. */
    public static void nvkQueueSubmit(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKQUEUESUBMIT, check(value)); }
    /** Unsafe version of {@link #vkQueueWaitIdle(long) vkQueueWaitIdle}. */
    public static void nvkQueueWaitIdle(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKQUEUEWAITIDLE, check(value)); }
    /** Unsafe version of {@link #vkCreateQueryPool(long) vkCreateQueryPool}. */
    public static void nvkCreateQueryPool(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKCREATEQUERYPOOL, check(value)); }
    /** Unsafe version of {@link #vkDestroyQueryPool(long) vkDestroyQueryPool}. */
    public static void nvkDestroyQueryPool(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKDESTROYQUERYPOOL, check(value)); }
    /** Unsafe version of {@link #vkResetQueryPool(long) vkResetQueryPool}. */
    public static void nvkResetQueryPool(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKRESETQUERYPOOL, check(value)); }
    /** Unsafe version of {@link #vkGetQueryPoolResults(long) vkGetQueryPoolResults}. */
    public static void nvkGetQueryPoolResults(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKGETQUERYPOOLRESULTS, check(value)); }
    /** Unsafe version of {@link #vkCmdWriteTimestamp(long) vkCmdWriteTimestamp}. */
    public static void nvkCmdWriteTimestamp(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKCMDWRITETIMESTAMP, check(value)); }
    /** Unsafe version of {@link #vkCreateSemaphore(long) vkCreateSemaphore}. */
    public static void nvkCreateSemaphore(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKCREATESEMAPHORE, check(value)); }
    /** Unsafe version of {@link #vkDestroySemaphore(long) vkDestroySemaphore}. */
    public static void nvkDestroySemaphore(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKDESTROYSEMAPHORE, check(value)); }
    /** Unsafe version of {@link #vkSignalSemaphore(long) vkSignalSemaphore}. */
    public static void nvkSignalSemaphore(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKSIGNALSEMAPHORE, check(value)); }
    /** Unsafe version of {@link #vkGetSemaphoreCounterValue(long) vkGetSemaphoreCounterValue}. */
    public static void nvkGetSemaphoreCounterValue(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKGETSEMAPHORECOUNTERVALUE, check(value)); }
    /** Unsafe version of {@link #vkGetCalibratedTimestampsEXT(long) vkGetCalibratedTimestampsEXT}. */
    public static void nvkGetCalibratedTimestampsEXT(long struct, long value) { memPutAddress(struct + RMTVulkanFunctions.VKGETCALIBRATEDTIMESTAMPSEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + RMTVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES));
        check(memGetAddress(struct + RMTVulkanFunctions.VKQUEUESUBMIT));
        check(memGetAddress(struct + RMTVulkanFunctions.VKQUEUEWAITIDLE));
        check(memGetAddress(struct + RMTVulkanFunctions.VKCREATEQUERYPOOL));
        check(memGetAddress(struct + RMTVulkanFunctions.VKDESTROYQUERYPOOL));
        check(memGetAddress(struct + RMTVulkanFunctions.VKRESETQUERYPOOL));
        check(memGetAddress(struct + RMTVulkanFunctions.VKGETQUERYPOOLRESULTS));
        check(memGetAddress(struct + RMTVulkanFunctions.VKCMDWRITETIMESTAMP));
        check(memGetAddress(struct + RMTVulkanFunctions.VKCREATESEMAPHORE));
        check(memGetAddress(struct + RMTVulkanFunctions.VKDESTROYSEMAPHORE));
        check(memGetAddress(struct + RMTVulkanFunctions.VKSIGNALSEMAPHORE));
        check(memGetAddress(struct + RMTVulkanFunctions.VKGETSEMAPHORECOUNTERVALUE));
        check(memGetAddress(struct + RMTVulkanFunctions.VKGETCALIBRATEDTIMESTAMPSEXT));
    }

    // -----------------------------------

    /** An array of {@link RMTVulkanFunctions} structs. */
    public static class Buffer extends StructBuffer<RMTVulkanFunctions, Buffer> implements NativeResource {

        private static final RMTVulkanFunctions ELEMENT_FACTORY = RMTVulkanFunctions.create(-1L);

        /**
         * Creates a new {@code RMTVulkanFunctions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RMTVulkanFunctions#SIZEOF}, and its mark will be undefined.</p>
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
        protected RMTVulkanFunctions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vkGetPhysicalDeviceProperties} field. */
        @NativeType("void *")
        public long vkGetPhysicalDeviceProperties() { return RMTVulkanFunctions.nvkGetPhysicalDeviceProperties(address()); }
        /** @return the value of the {@code vkQueueSubmit} field. */
        @NativeType("void *")
        public long vkQueueSubmit() { return RMTVulkanFunctions.nvkQueueSubmit(address()); }
        /** @return the value of the {@code vkQueueWaitIdle} field. */
        @NativeType("void *")
        public long vkQueueWaitIdle() { return RMTVulkanFunctions.nvkQueueWaitIdle(address()); }
        /** @return the value of the {@code vkCreateQueryPool} field. */
        @NativeType("void *")
        public long vkCreateQueryPool() { return RMTVulkanFunctions.nvkCreateQueryPool(address()); }
        /** @return the value of the {@code vkDestroyQueryPool} field. */
        @NativeType("void *")
        public long vkDestroyQueryPool() { return RMTVulkanFunctions.nvkDestroyQueryPool(address()); }
        /** @return the value of the {@code vkResetQueryPool} field. */
        @NativeType("void *")
        public long vkResetQueryPool() { return RMTVulkanFunctions.nvkResetQueryPool(address()); }
        /** @return the value of the {@code vkGetQueryPoolResults} field. */
        @NativeType("void *")
        public long vkGetQueryPoolResults() { return RMTVulkanFunctions.nvkGetQueryPoolResults(address()); }
        /** @return the value of the {@code vkCmdWriteTimestamp} field. */
        @NativeType("void *")
        public long vkCmdWriteTimestamp() { return RMTVulkanFunctions.nvkCmdWriteTimestamp(address()); }
        /** @return the value of the {@code vkCreateSemaphore} field. */
        @NativeType("void *")
        public long vkCreateSemaphore() { return RMTVulkanFunctions.nvkCreateSemaphore(address()); }
        /** @return the value of the {@code vkDestroySemaphore} field. */
        @NativeType("void *")
        public long vkDestroySemaphore() { return RMTVulkanFunctions.nvkDestroySemaphore(address()); }
        /** @return the value of the {@code vkSignalSemaphore} field. */
        @NativeType("void *")
        public long vkSignalSemaphore() { return RMTVulkanFunctions.nvkSignalSemaphore(address()); }
        /** @return the value of the {@code vkGetSemaphoreCounterValue} field. */
        @NativeType("void *")
        public long vkGetSemaphoreCounterValue() { return RMTVulkanFunctions.nvkGetSemaphoreCounterValue(address()); }
        /** @return the value of the {@code vkGetCalibratedTimestampsEXT} field. */
        @NativeType("void *")
        public long vkGetCalibratedTimestampsEXT() { return RMTVulkanFunctions.nvkGetCalibratedTimestampsEXT(address()); }

        /** Sets the specified value to the {@code vkGetPhysicalDeviceProperties} field. */
        public RMTVulkanFunctions.Buffer vkGetPhysicalDeviceProperties(@NativeType("void *") long value) { RMTVulkanFunctions.nvkGetPhysicalDeviceProperties(address(), value); return this; }
        /** Sets the specified value to the {@code vkQueueSubmit} field. */
        public RMTVulkanFunctions.Buffer vkQueueSubmit(@NativeType("void *") long value) { RMTVulkanFunctions.nvkQueueSubmit(address(), value); return this; }
        /** Sets the specified value to the {@code vkQueueWaitIdle} field. */
        public RMTVulkanFunctions.Buffer vkQueueWaitIdle(@NativeType("void *") long value) { RMTVulkanFunctions.nvkQueueWaitIdle(address(), value); return this; }
        /** Sets the specified value to the {@code vkCreateQueryPool} field. */
        public RMTVulkanFunctions.Buffer vkCreateQueryPool(@NativeType("void *") long value) { RMTVulkanFunctions.nvkCreateQueryPool(address(), value); return this; }
        /** Sets the specified value to the {@code vkDestroyQueryPool} field. */
        public RMTVulkanFunctions.Buffer vkDestroyQueryPool(@NativeType("void *") long value) { RMTVulkanFunctions.nvkDestroyQueryPool(address(), value); return this; }
        /** Sets the specified value to the {@code vkResetQueryPool} field. */
        public RMTVulkanFunctions.Buffer vkResetQueryPool(@NativeType("void *") long value) { RMTVulkanFunctions.nvkResetQueryPool(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetQueryPoolResults} field. */
        public RMTVulkanFunctions.Buffer vkGetQueryPoolResults(@NativeType("void *") long value) { RMTVulkanFunctions.nvkGetQueryPoolResults(address(), value); return this; }
        /** Sets the specified value to the {@code vkCmdWriteTimestamp} field. */
        public RMTVulkanFunctions.Buffer vkCmdWriteTimestamp(@NativeType("void *") long value) { RMTVulkanFunctions.nvkCmdWriteTimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code vkCreateSemaphore} field. */
        public RMTVulkanFunctions.Buffer vkCreateSemaphore(@NativeType("void *") long value) { RMTVulkanFunctions.nvkCreateSemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code vkDestroySemaphore} field. */
        public RMTVulkanFunctions.Buffer vkDestroySemaphore(@NativeType("void *") long value) { RMTVulkanFunctions.nvkDestroySemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code vkSignalSemaphore} field. */
        public RMTVulkanFunctions.Buffer vkSignalSemaphore(@NativeType("void *") long value) { RMTVulkanFunctions.nvkSignalSemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetSemaphoreCounterValue} field. */
        public RMTVulkanFunctions.Buffer vkGetSemaphoreCounterValue(@NativeType("void *") long value) { RMTVulkanFunctions.nvkGetSemaphoreCounterValue(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetCalibratedTimestampsEXT} field. */
        public RMTVulkanFunctions.Buffer vkGetCalibratedTimestampsEXT(@NativeType("void *") long value) { RMTVulkanFunctions.nvkGetCalibratedTimestampsEXT(address(), value); return this; }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDebugUtilsMessengerCallbackDataEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
 *     char const * pMessageIdName;
 *     int32_t messageIdNumber;
 *     char const * pMessage;
 *     uint32_t queueLabelCount;
 *     {@link VkDebugUtilsLabelEXT VkDebugUtilsLabelEXT} const * pQueueLabels;
 *     uint32_t cmdBufLabelCount;
 *     {@link VkDebugUtilsLabelEXT VkDebugUtilsLabelEXT} const * pCmdBufLabels;
 *     uint32_t objectCount;
 *     {@link VkDebugUtilsObjectNameInfoEXT VkDebugUtilsObjectNameInfoEXT} const * pObjects;
 * }</code></pre>
 */
public class VkDebugUtilsMessengerCallbackDataEXT extends Struct<VkDebugUtilsMessengerCallbackDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PMESSAGEIDNAME,
        MESSAGEIDNUMBER,
        PMESSAGE,
        QUEUELABELCOUNT,
        PQUEUELABELS,
        CMDBUFLABELCOUNT,
        PCMDBUFLABELS,
        OBJECTCOUNT,
        POBJECTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PMESSAGEIDNAME = layout.offsetof(3);
        MESSAGEIDNUMBER = layout.offsetof(4);
        PMESSAGE = layout.offsetof(5);
        QUEUELABELCOUNT = layout.offsetof(6);
        PQUEUELABELS = layout.offsetof(7);
        CMDBUFLABELCOUNT = layout.offsetof(8);
        PCMDBUFLABELS = layout.offsetof(9);
        OBJECTCOUNT = layout.offsetof(10);
        POBJECTS = layout.offsetof(11);
    }

    protected VkDebugUtilsMessengerCallbackDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDebugUtilsMessengerCallbackDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDebugUtilsMessengerCallbackDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDebugUtilsMessengerCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsMessengerCallbackDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMessageIdName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pMessageIdName() { return npMessageIdName(address()); }
    /** @return the null-terminated string pointed to by the {@code pMessageIdName} field. */
    @NativeType("char const *")
    public @Nullable String pMessageIdNameString() { return npMessageIdNameString(address()); }
    /** @return the value of the {@code messageIdNumber} field. */
    @NativeType("int32_t")
    public int messageIdNumber() { return nmessageIdNumber(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMessage} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pMessage() { return npMessage(address()); }
    /** @return the null-terminated string pointed to by the {@code pMessage} field. */
    @NativeType("char const *")
    public @Nullable String pMessageString() { return npMessageString(address()); }
    /** @return the value of the {@code queueLabelCount} field. */
    @NativeType("uint32_t")
    public int queueLabelCount() { return nqueueLabelCount(address()); }
    /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code pQueueLabels} field. */
    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.@Nullable Buffer pQueueLabels() { return npQueueLabels(address()); }
    /** @return the value of the {@code cmdBufLabelCount} field. */
    @NativeType("uint32_t")
    public int cmdBufLabelCount() { return ncmdBufLabelCount(address()); }
    /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code pCmdBufLabels} field. */
    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.@Nullable Buffer pCmdBufLabels() { return npCmdBufLabels(address()); }
    /** @return the value of the {@code objectCount} field. */
    @NativeType("uint32_t")
    public int objectCount() { return nobjectCount(address()); }
    /** @return a {@link VkDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@code pObjects} field. */
    @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
    public VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer pObjects() { return npObjects(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugUtilsMessengerCallbackDataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@code sType} field. */
    public VkDebugUtilsMessengerCallbackDataEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceAddressBindingCallbackDataEXT} value to the {@code pNext} chain. */
    public VkDebugUtilsMessengerCallbackDataEXT pNext(VkDeviceAddressBindingCallbackDataEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDebugUtilsMessengerCallbackDataEXT flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pMessageIdName} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(@Nullable @NativeType("char const *") ByteBuffer value) { npMessageIdName(address(), value); return this; }
    /** Sets the specified value to the {@code messageIdNumber} field. */
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(@NativeType("int32_t") int value) { nmessageIdNumber(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pMessage} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(@Nullable @NativeType("char const *") ByteBuffer value) { npMessage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@code pQueueLabels} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.@Nullable Buffer value) { npQueueLabels(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@code pCmdBufLabels} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.@Nullable Buffer value) { npCmdBufLabels(address(), value); return this; }
    /** Sets the address of the specified {@link VkDebugUtilsObjectNameInfoEXT.Buffer} to the {@code pObjects} field. */
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(@NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { npObjects(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsMessengerCallbackDataEXT set(
        int sType,
        long pNext,
        int flags,
        @Nullable ByteBuffer pMessageIdName,
        int messageIdNumber,
        @Nullable ByteBuffer pMessage,
        VkDebugUtilsLabelEXT.@Nullable Buffer pQueueLabels,
        VkDebugUtilsLabelEXT.@Nullable Buffer pCmdBufLabels,
        VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer pObjects
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pMessageIdName(pMessageIdName);
        messageIdNumber(messageIdNumber);
        pMessage(pMessage);
        pQueueLabels(pQueueLabels);
        pCmdBufLabels(pCmdBufLabels);
        pObjects(pObjects);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsMessengerCallbackDataEXT set(VkDebugUtilsMessengerCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCallbackDataEXT malloc() {
        return new VkDebugUtilsMessengerCallbackDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsMessengerCallbackDataEXT calloc() {
        return new VkDebugUtilsMessengerCallbackDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsMessengerCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsMessengerCallbackDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance for the specified memory address. */
    public static VkDebugUtilsMessengerCallbackDataEXT create(long address) {
        return new VkDebugUtilsMessengerCallbackDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDebugUtilsMessengerCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDebugUtilsMessengerCallbackDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDebugUtilsMessengerCallbackDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDebugUtilsMessengerCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsMessengerCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.FLAGS); }
    /** Unsafe version of {@link #pMessageIdName}. */
    public static @Nullable ByteBuffer npMessageIdName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME)); }
    /** Unsafe version of {@link #pMessageIdNameString}. */
    public static @Nullable String npMessageIdNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME)); }
    /** Unsafe version of {@link #messageIdNumber}. */
    public static int nmessageIdNumber(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER); }
    /** Unsafe version of {@link #pMessage}. */
    public static @Nullable ByteBuffer npMessage(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE)); }
    /** Unsafe version of {@link #pMessageString}. */
    public static @Nullable String npMessageString(long struct) { return memUTF8Safe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE)); }
    /** Unsafe version of {@link #queueLabelCount}. */
    public static int nqueueLabelCount(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT); }
    /** Unsafe version of {@link #pQueueLabels}. */
    public static VkDebugUtilsLabelEXT.@Nullable Buffer npQueueLabels(long struct) { return VkDebugUtilsLabelEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS), nqueueLabelCount(struct)); }
    /** Unsafe version of {@link #cmdBufLabelCount}. */
    public static int ncmdBufLabelCount(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT); }
    /** Unsafe version of {@link #pCmdBufLabels}. */
    public static VkDebugUtilsLabelEXT.@Nullable Buffer npCmdBufLabels(long struct) { return VkDebugUtilsLabelEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS), ncmdBufLabelCount(struct)); }
    /** Unsafe version of {@link #objectCount}. */
    public static int nobjectCount(long struct) { return memGetInt(struct + VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT); }
    /** Unsafe version of {@link #pObjects}. */
    public static VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer npObjects(long struct) { return VkDebugUtilsObjectNameInfoEXT.createSafe(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS), nobjectCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.FLAGS, value); }
    /** Unsafe version of {@link #pMessageIdName(ByteBuffer) pMessageIdName}. */
    public static void npMessageIdName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #messageIdNumber(int) messageIdNumber}. */
    public static void nmessageIdNumber(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER, value); }
    /** Unsafe version of {@link #pMessage(ByteBuffer) pMessage}. */
    public static void npMessage(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE, memAddressSafe(value));
    }
    /** Sets the specified value to the {@code queueLabelCount} field of the specified {@code struct}. */
    public static void nqueueLabelCount(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT, value); }
    /** Unsafe version of {@link #pQueueLabels(VkDebugUtilsLabelEXT.Buffer) pQueueLabels}. */
    public static void npQueueLabels(long struct, VkDebugUtilsLabelEXT.@Nullable Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS, memAddressSafe(value)); nqueueLabelCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code cmdBufLabelCount} field of the specified {@code struct}. */
    public static void ncmdBufLabelCount(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT, value); }
    /** Unsafe version of {@link #pCmdBufLabels(VkDebugUtilsLabelEXT.Buffer) pCmdBufLabels}. */
    public static void npCmdBufLabels(long struct, VkDebugUtilsLabelEXT.@Nullable Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS, memAddressSafe(value)); ncmdBufLabelCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code objectCount} field of the specified {@code struct}. */
    public static void nobjectCount(long struct, int value) { memPutInt(struct + VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT, value); }
    /** Unsafe version of {@link #pObjects(VkDebugUtilsObjectNameInfoEXT.Buffer) pObjects}. */
    public static void npObjects(long struct, VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { memPutAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS, memAddressSafe(value)); nobjectCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int queueLabelCount = nqueueLabelCount(struct);
        if (queueLabelCount != 0) {
            long pQueueLabels = memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS);
            check(pQueueLabels);
            validate(pQueueLabels, queueLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        int cmdBufLabelCount = ncmdBufLabelCount(struct);
        if (cmdBufLabelCount != 0) {
            long pCmdBufLabels = memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS);
            check(pCmdBufLabels);
            validate(pCmdBufLabels, cmdBufLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        if (nobjectCount(struct) != 0) {
            check(memGetAddress(struct + VkDebugUtilsMessengerCallbackDataEXT.POBJECTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsMessengerCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCallbackDataEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsMessengerCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsMessengerCallbackDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDebugUtilsMessengerCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsMessengerCallbackDataEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsMessengerCallbackDataEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
        public int flags() { return VkDebugUtilsMessengerCallbackDataEXT.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMessageIdName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pMessageIdName() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address()); }
        /** @return the null-terminated string pointed to by the {@code pMessageIdName} field. */
        @NativeType("char const *")
        public @Nullable String pMessageIdNameString() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdNameString(address()); }
        /** @return the value of the {@code messageIdNumber} field. */
        @NativeType("int32_t")
        public int messageIdNumber() { return VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMessage} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pMessage() { return VkDebugUtilsMessengerCallbackDataEXT.npMessage(address()); }
        /** @return the null-terminated string pointed to by the {@code pMessage} field. */
        @NativeType("char const *")
        public @Nullable String pMessageString() { return VkDebugUtilsMessengerCallbackDataEXT.npMessageString(address()); }
        /** @return the value of the {@code queueLabelCount} field. */
        @NativeType("uint32_t")
        public int queueLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.nqueueLabelCount(address()); }
        /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code pQueueLabels} field. */
        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.@Nullable Buffer pQueueLabels() { return VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address()); }
        /** @return the value of the {@code cmdBufLabelCount} field. */
        @NativeType("uint32_t")
        public int cmdBufLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.ncmdBufLabelCount(address()); }
        /** @return a {@link VkDebugUtilsLabelEXT.Buffer} view of the struct array pointed to by the {@code pCmdBufLabels} field. */
        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.@Nullable Buffer pCmdBufLabels() { return VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address()); }
        /** @return the value of the {@code objectCount} field. */
        @NativeType("uint32_t")
        public int objectCount() { return VkDebugUtilsMessengerCallbackDataEXT.nobjectCount(address()); }
        /** @return a {@link VkDebugUtilsObjectNameInfoEXT.Buffer} view of the struct array pointed to by the {@code pObjects} field. */
        @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
        public VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer pObjects() { return VkDebugUtilsMessengerCallbackDataEXT.npObjects(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsMessengerCallbackDataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT} value to the {@code sType} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsMessengerCallbackDataEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceAddressBindingCallbackDataEXT} value to the {@code pNext} chain. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pNext(VkDeviceAddressBindingCallbackDataEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VkDebugUtilsMessengerCallbackDataEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pMessageIdName} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessageIdName(@Nullable @NativeType("char const *") ByteBuffer value) { VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address(), value); return this; }
        /** Sets the specified value to the {@code messageIdNumber} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer messageIdNumber(@NativeType("int32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pMessage} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessage(@Nullable @NativeType("char const *") ByteBuffer value) { VkDebugUtilsMessengerCallbackDataEXT.npMessage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@code pQueueLabels} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pQueueLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.@Nullable Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsLabelEXT.Buffer} to the {@code pCmdBufLabels} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pCmdBufLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.@Nullable Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address(), value); return this; }
        /** Sets the address of the specified {@link VkDebugUtilsObjectNameInfoEXT.Buffer} to the {@code pObjects} field. */
        public VkDebugUtilsMessengerCallbackDataEXT.Buffer pObjects(@NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.@Nullable Buffer value) { VkDebugUtilsMessengerCallbackDataEXT.npObjects(address(), value); return this; }

    }

}
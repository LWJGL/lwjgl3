/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hwloc_obj {
 *     hwloc_obj_type_t type;
 *     char * subtype;
 *     unsigned os_index;
 *     char * name;
 *     hwloc_uint64_t total_memory;
 *     {@link hwloc_obj_attr_u struct hwloc_obj_attr_u} * attr;
 *     int depth;
 *     unsigned logical_index;
 *     {@link hwloc_obj struct hwloc_obj} * next_cousin;
 *     {@link hwloc_obj struct hwloc_obj} * prev_cousin;
 *     {@link hwloc_obj struct hwloc_obj} * parent;
 *     unsigned sibling_rank;
 *     {@link hwloc_obj struct hwloc_obj} * next_sibling;
 *     {@link hwloc_obj struct hwloc_obj} * prev_sibling;
 *     unsigned arity;
 *     {@link hwloc_obj struct hwloc_obj} ** children;
 *     {@link hwloc_obj struct hwloc_obj} * first_child;
 *     {@link hwloc_obj struct hwloc_obj} * last_child;
 *     int symmetric_subtree;
 *     unsigned memory_arity;
 *     {@link hwloc_obj struct hwloc_obj} * memory_first_child;
 *     unsigned io_arity;
 *     {@link hwloc_obj struct hwloc_obj} * io_first_child;
 *     unsigned misc_arity;
 *     {@link hwloc_obj struct hwloc_obj} * misc_first_child;
 *     hwloc_cpuset_t cpuset;
 *     hwloc_cpuset_t complete_cpuset;
 *     hwloc_nodeset_t nodeset;
 *     hwloc_nodeset_t complete_nodeset;
 *     {@link hwloc_infos_s struct hwloc_infos_s} infos;
 *     void * userdata;
 *     hwloc_uint64_t gp_index;
 * }</code></pre>
 */
@NativeType("struct hwloc_obj")
public class hwloc_obj extends Struct<hwloc_obj> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SUBTYPE,
        OS_INDEX,
        NAME,
        TOTAL_MEMORY,
        ATTR,
        DEPTH,
        LOGICAL_INDEX,
        NEXT_COUSIN,
        PREV_COUSIN,
        PARENT,
        SIBLING_RANK,
        NEXT_SIBLING,
        PREV_SIBLING,
        ARITY,
        CHILDREN,
        FIRST_CHILD,
        LAST_CHILD,
        SYMMETRIC_SUBTREE,
        MEMORY_ARITY,
        MEMORY_FIRST_CHILD,
        IO_ARITY,
        IO_FIRST_CHILD,
        MISC_ARITY,
        MISC_FIRST_CHILD,
        CPUSET,
        COMPLETE_CPUSET,
        NODESET,
        COMPLETE_NODESET,
        INFOS,
        USERDATA,
        GP_INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(hwloc_infos_s.SIZEOF, hwloc_infos_s.ALIGNOF),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SUBTYPE = layout.offsetof(1);
        OS_INDEX = layout.offsetof(2);
        NAME = layout.offsetof(3);
        TOTAL_MEMORY = layout.offsetof(4);
        ATTR = layout.offsetof(5);
        DEPTH = layout.offsetof(6);
        LOGICAL_INDEX = layout.offsetof(7);
        NEXT_COUSIN = layout.offsetof(8);
        PREV_COUSIN = layout.offsetof(9);
        PARENT = layout.offsetof(10);
        SIBLING_RANK = layout.offsetof(11);
        NEXT_SIBLING = layout.offsetof(12);
        PREV_SIBLING = layout.offsetof(13);
        ARITY = layout.offsetof(14);
        CHILDREN = layout.offsetof(15);
        FIRST_CHILD = layout.offsetof(16);
        LAST_CHILD = layout.offsetof(17);
        SYMMETRIC_SUBTREE = layout.offsetof(18);
        MEMORY_ARITY = layout.offsetof(19);
        MEMORY_FIRST_CHILD = layout.offsetof(20);
        IO_ARITY = layout.offsetof(21);
        IO_FIRST_CHILD = layout.offsetof(22);
        MISC_ARITY = layout.offsetof(23);
        MISC_FIRST_CHILD = layout.offsetof(24);
        CPUSET = layout.offsetof(25);
        COMPLETE_CPUSET = layout.offsetof(26);
        NODESET = layout.offsetof(27);
        COMPLETE_NODESET = layout.offsetof(28);
        INFOS = layout.offsetof(29);
        USERDATA = layout.offsetof(30);
        GP_INDEX = layout.offsetof(31);
    }

    protected hwloc_obj(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_obj create(long address, @Nullable ByteBuffer container) {
        return new hwloc_obj(address, container);
    }

    /**
     * Creates a {@code hwloc_obj} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_obj(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("hwloc_obj_type_t")
    public int type() { return ntype(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code subtype} field. */
    @NativeType("char *")
    public ByteBuffer subtype() { return nsubtype(address()); }
    /** @return the null-terminated string pointed to by the {@code subtype} field. */
    @NativeType("char *")
    public String subtypeString() { return nsubtypeString(address()); }
    /** @return the value of the {@code os_index} field. */
    @NativeType("unsigned")
    public int os_index() { return nos_index(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @Nullable
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @Nullable
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code total_memory} field. */
    @NativeType("hwloc_uint64_t")
    public long total_memory() { return ntotal_memory(address()); }
    /** @return a {@link hwloc_obj_attr_u} view of the struct pointed to by the {@code attr} field. */
    @NativeType("struct hwloc_obj_attr_u *")
    public hwloc_obj_attr_u attr() { return nattr(address()); }
    /** @return the value of the {@code depth} field. */
    public int depth() { return ndepth(address()); }
    /** @return the value of the {@code logical_index} field. */
    @NativeType("unsigned")
    public int logical_index() { return nlogical_index(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code next_cousin} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj next_cousin() { return nnext_cousin(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code prev_cousin} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj prev_cousin() { return nprev_cousin(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code parent} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj parent() { return nparent(address()); }
    /** @return the value of the {@code sibling_rank} field. */
    @NativeType("unsigned")
    public int sibling_rank() { return nsibling_rank(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code next_sibling} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj next_sibling() { return nnext_sibling(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code prev_sibling} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj prev_sibling() { return nprev_sibling(address()); }
    /** @return the value of the {@code arity} field. */
    @NativeType("unsigned")
    public int arity() { return narity(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code children} field. */
    @Nullable
    @NativeType("struct hwloc_obj **")
    public PointerBuffer children() { return nchildren(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code first_child} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj first_child() { return nfirst_child(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code last_child} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj last_child() { return nlast_child(address()); }
    /** @return the value of the {@code symmetric_subtree} field. */
    @NativeType("int")
    public boolean symmetric_subtree() { return nsymmetric_subtree(address()) != 0; }
    /** @return the value of the {@code memory_arity} field. */
    @NativeType("unsigned")
    public int memory_arity() { return nmemory_arity(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code memory_first_child} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj memory_first_child() { return nmemory_first_child(address()); }
    /** @return the value of the {@code io_arity} field. */
    @NativeType("unsigned")
    public int io_arity() { return nio_arity(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code io_first_child} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj io_first_child() { return nio_first_child(address()); }
    /** @return the value of the {@code misc_arity} field. */
    @NativeType("unsigned")
    public int misc_arity() { return nmisc_arity(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code misc_first_child} field. */
    @Nullable
    @NativeType("struct hwloc_obj *")
    public hwloc_obj misc_first_child() { return nmisc_first_child(address()); }
    /** @return the value of the {@code cpuset} field. */
    @NativeType("hwloc_cpuset_t")
    public long cpuset() { return ncpuset(address()); }
    /** @return the value of the {@code complete_cpuset} field. */
    @NativeType("hwloc_cpuset_t")
    public long complete_cpuset() { return ncomplete_cpuset(address()); }
    /** @return the value of the {@code nodeset} field. */
    @NativeType("hwloc_nodeset_t")
    public long nodeset() { return nnodeset(address()); }
    /** @return the value of the {@code complete_nodeset} field. */
    @NativeType("hwloc_nodeset_t")
    public long complete_nodeset() { return ncomplete_nodeset(address()); }
    /** @return a {@link hwloc_infos_s} view of the {@code infos} field. */
    @NativeType("struct hwloc_infos_s")
    public hwloc_infos_s infos() { return ninfos(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code gp_index} field. */
    @NativeType("hwloc_uint64_t")
    public long gp_index() { return ngp_index(address()); }

    /** Sets the specified value to the {@code userdata} field. */
    public hwloc_obj userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hwloc_obj set(hwloc_obj src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hwloc_obj} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hwloc_obj malloc() {
        return new hwloc_obj(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hwloc_obj} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hwloc_obj calloc() {
        return new hwloc_obj(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hwloc_obj} instance allocated with {@link BufferUtils}. */
    public static hwloc_obj create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hwloc_obj(memAddress(container), container);
    }

    /** Returns a new {@code hwloc_obj} instance for the specified memory address. */
    public static hwloc_obj create(long address) {
        return new hwloc_obj(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_obj createSafe(long address) {
        return address == NULL ? null : new hwloc_obj(address, null);
    }

    /**
     * Returns a new {@link hwloc_obj.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hwloc_obj.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_obj.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hwloc_obj} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_obj malloc(MemoryStack stack) {
        return new hwloc_obj(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hwloc_obj} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_obj calloc(MemoryStack stack) {
        return new hwloc_obj(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hwloc_obj.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_obj.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.TYPE); }
    /** Unsafe version of {@link #subtype}. */
    public static ByteBuffer nsubtype(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_obj.SUBTYPE)); }
    /** Unsafe version of {@link #subtypeString}. */
    public static String nsubtypeString(long struct) { return memASCII(memGetAddress(struct + hwloc_obj.SUBTYPE)); }
    /** Unsafe version of {@link #os_index}. */
    public static int nos_index(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.OS_INDEX); }
    /** Unsafe version of {@link #name}. */
    @Nullable public static ByteBuffer nname(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + hwloc_obj.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    @Nullable public static String nnameString(long struct) { return memASCIISafe(memGetAddress(struct + hwloc_obj.NAME)); }
    /** Unsafe version of {@link #total_memory}. */
    public static long ntotal_memory(long struct) { return UNSAFE.getLong(null, struct + hwloc_obj.TOTAL_MEMORY); }
    /** Unsafe version of {@link #attr}. */
    public static hwloc_obj_attr_u nattr(long struct) { return hwloc_obj_attr_u.create(memGetAddress(struct + hwloc_obj.ATTR)); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.DEPTH); }
    /** Unsafe version of {@link #logical_index}. */
    public static int nlogical_index(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.LOGICAL_INDEX); }
    /** Unsafe version of {@link #next_cousin}. */
    @Nullable public static hwloc_obj nnext_cousin(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.NEXT_COUSIN)); }
    /** Unsafe version of {@link #prev_cousin}. */
    @Nullable public static hwloc_obj nprev_cousin(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.PREV_COUSIN)); }
    /** Unsafe version of {@link #parent}. */
    @Nullable public static hwloc_obj nparent(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.PARENT)); }
    /** Unsafe version of {@link #sibling_rank}. */
    public static int nsibling_rank(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.SIBLING_RANK); }
    /** Unsafe version of {@link #next_sibling}. */
    @Nullable public static hwloc_obj nnext_sibling(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.NEXT_SIBLING)); }
    /** Unsafe version of {@link #prev_sibling}. */
    @Nullable public static hwloc_obj nprev_sibling(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.PREV_SIBLING)); }
    /** Unsafe version of {@link #arity}. */
    public static int narity(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.ARITY); }
    /** Unsafe version of {@link #children() children}. */
    @Nullable public static PointerBuffer nchildren(long struct) { return memPointerBufferSafe(memGetAddress(struct + hwloc_obj.CHILDREN), narity(struct)); }
    /** Unsafe version of {@link #first_child}. */
    @Nullable public static hwloc_obj nfirst_child(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.FIRST_CHILD)); }
    /** Unsafe version of {@link #last_child}. */
    @Nullable public static hwloc_obj nlast_child(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.LAST_CHILD)); }
    /** Unsafe version of {@link #symmetric_subtree}. */
    public static int nsymmetric_subtree(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.SYMMETRIC_SUBTREE); }
    /** Unsafe version of {@link #memory_arity}. */
    public static int nmemory_arity(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.MEMORY_ARITY); }
    /** Unsafe version of {@link #memory_first_child}. */
    @Nullable public static hwloc_obj nmemory_first_child(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.MEMORY_FIRST_CHILD)); }
    /** Unsafe version of {@link #io_arity}. */
    public static int nio_arity(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.IO_ARITY); }
    /** Unsafe version of {@link #io_first_child}. */
    @Nullable public static hwloc_obj nio_first_child(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.IO_FIRST_CHILD)); }
    /** Unsafe version of {@link #misc_arity}. */
    public static int nmisc_arity(long struct) { return UNSAFE.getInt(null, struct + hwloc_obj.MISC_ARITY); }
    /** Unsafe version of {@link #misc_first_child}. */
    @Nullable public static hwloc_obj nmisc_first_child(long struct) { return hwloc_obj.createSafe(memGetAddress(struct + hwloc_obj.MISC_FIRST_CHILD)); }
    /** Unsafe version of {@link #cpuset}. */
    public static long ncpuset(long struct) { return memGetAddress(struct + hwloc_obj.CPUSET); }
    /** Unsafe version of {@link #complete_cpuset}. */
    public static long ncomplete_cpuset(long struct) { return memGetAddress(struct + hwloc_obj.COMPLETE_CPUSET); }
    /** Unsafe version of {@link #nodeset}. */
    public static long nnodeset(long struct) { return memGetAddress(struct + hwloc_obj.NODESET); }
    /** Unsafe version of {@link #complete_nodeset}. */
    public static long ncomplete_nodeset(long struct) { return memGetAddress(struct + hwloc_obj.COMPLETE_NODESET); }
    /** Unsafe version of {@link #infos}. */
    public static hwloc_infos_s ninfos(long struct) { return hwloc_infos_s.create(struct + hwloc_obj.INFOS); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + hwloc_obj.USERDATA); }
    /** Unsafe version of {@link #gp_index}. */
    public static long ngp_index(long struct) { return UNSAFE.getLong(null, struct + hwloc_obj.GP_INDEX); }

    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + hwloc_obj.USERDATA, value); }

    // -----------------------------------

    /** An array of {@link hwloc_obj} structs. */
    public static class Buffer extends StructBuffer<hwloc_obj, Buffer> implements NativeResource {

        private static final hwloc_obj ELEMENT_FACTORY = hwloc_obj.create(-1L);

        /**
         * Creates a new {@code hwloc_obj.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_obj#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_obj getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("hwloc_obj_type_t")
        public int type() { return hwloc_obj.ntype(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code subtype} field. */
        @NativeType("char *")
        public ByteBuffer subtype() { return hwloc_obj.nsubtype(address()); }
        /** @return the null-terminated string pointed to by the {@code subtype} field. */
        @NativeType("char *")
        public String subtypeString() { return hwloc_obj.nsubtypeString(address()); }
        /** @return the value of the {@code os_index} field. */
        @NativeType("unsigned")
        public int os_index() { return hwloc_obj.nos_index(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @Nullable
        @NativeType("char *")
        public ByteBuffer name() { return hwloc_obj.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @Nullable
        @NativeType("char *")
        public String nameString() { return hwloc_obj.nnameString(address()); }
        /** @return the value of the {@code total_memory} field. */
        @NativeType("hwloc_uint64_t")
        public long total_memory() { return hwloc_obj.ntotal_memory(address()); }
        /** @return a {@link hwloc_obj_attr_u} view of the struct pointed to by the {@code attr} field. */
        @NativeType("struct hwloc_obj_attr_u *")
        public hwloc_obj_attr_u attr() { return hwloc_obj.nattr(address()); }
        /** @return the value of the {@code depth} field. */
        public int depth() { return hwloc_obj.ndepth(address()); }
        /** @return the value of the {@code logical_index} field. */
        @NativeType("unsigned")
        public int logical_index() { return hwloc_obj.nlogical_index(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code next_cousin} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj next_cousin() { return hwloc_obj.nnext_cousin(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code prev_cousin} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj prev_cousin() { return hwloc_obj.nprev_cousin(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code parent} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj parent() { return hwloc_obj.nparent(address()); }
        /** @return the value of the {@code sibling_rank} field. */
        @NativeType("unsigned")
        public int sibling_rank() { return hwloc_obj.nsibling_rank(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code next_sibling} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj next_sibling() { return hwloc_obj.nnext_sibling(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code prev_sibling} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj prev_sibling() { return hwloc_obj.nprev_sibling(address()); }
        /** @return the value of the {@code arity} field. */
        @NativeType("unsigned")
        public int arity() { return hwloc_obj.narity(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code children} field. */
        @Nullable
        @NativeType("struct hwloc_obj **")
        public PointerBuffer children() { return hwloc_obj.nchildren(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code first_child} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj first_child() { return hwloc_obj.nfirst_child(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code last_child} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj last_child() { return hwloc_obj.nlast_child(address()); }
        /** @return the value of the {@code symmetric_subtree} field. */
        @NativeType("int")
        public boolean symmetric_subtree() { return hwloc_obj.nsymmetric_subtree(address()) != 0; }
        /** @return the value of the {@code memory_arity} field. */
        @NativeType("unsigned")
        public int memory_arity() { return hwloc_obj.nmemory_arity(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code memory_first_child} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj memory_first_child() { return hwloc_obj.nmemory_first_child(address()); }
        /** @return the value of the {@code io_arity} field. */
        @NativeType("unsigned")
        public int io_arity() { return hwloc_obj.nio_arity(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code io_first_child} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj io_first_child() { return hwloc_obj.nio_first_child(address()); }
        /** @return the value of the {@code misc_arity} field. */
        @NativeType("unsigned")
        public int misc_arity() { return hwloc_obj.nmisc_arity(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code misc_first_child} field. */
        @Nullable
        @NativeType("struct hwloc_obj *")
        public hwloc_obj misc_first_child() { return hwloc_obj.nmisc_first_child(address()); }
        /** @return the value of the {@code cpuset} field. */
        @NativeType("hwloc_cpuset_t")
        public long cpuset() { return hwloc_obj.ncpuset(address()); }
        /** @return the value of the {@code complete_cpuset} field. */
        @NativeType("hwloc_cpuset_t")
        public long complete_cpuset() { return hwloc_obj.ncomplete_cpuset(address()); }
        /** @return the value of the {@code nodeset} field. */
        @NativeType("hwloc_nodeset_t")
        public long nodeset() { return hwloc_obj.nnodeset(address()); }
        /** @return the value of the {@code complete_nodeset} field. */
        @NativeType("hwloc_nodeset_t")
        public long complete_nodeset() { return hwloc_obj.ncomplete_nodeset(address()); }
        /** @return a {@link hwloc_infos_s} view of the {@code infos} field. */
        @NativeType("struct hwloc_infos_s")
        public hwloc_infos_s infos() { return hwloc_obj.ninfos(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return hwloc_obj.nuserdata(address()); }
        /** @return the value of the {@code gp_index} field. */
        @NativeType("hwloc_uint64_t")
        public long gp_index() { return hwloc_obj.ngp_index(address()); }

        /** Sets the specified value to the {@code userdata} field. */
        public hwloc_obj.Buffer userdata(@NativeType("void *") long value) { hwloc_obj.nuserdata(address(), value); return this; }

    }

}
/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "heap.h"

typedef struct _t_heap_node {
    t_heap_key key;
    t_heap_cost cost;
} t_heap_node;
typedef t_heap_node *p_heap_node;

typedef struct _t_heap {
    t_heap_key bottom;
    t_heap_key max;
    p_heap_node node;
    t_heap_key *position;
} t_heap;

static void heap_swap(p_heap h, t_heap_key i, t_heap_key j);
static void heap_bubbledown(p_heap h, t_heap_key i);
static void heap_bubbleup(p_heap h, t_heap_key i);

int heap_create(p_heap *H, t_heap_key max) {
    p_heap h;
    assert(max > 0);
    *H = h = (p_heap) malloc(sizeof(t_heap));
    assert(h);
    if (!h) return 0;
    h->max = max; 
    h->bottom = 0;
    /* heap indices are 1-based */
    h->node = (p_heap_node) malloc(sizeof(t_heap_node) * (max+1)); 
    h->position = (t_heap_key *) malloc(sizeof(t_heap_key) * (max+1));
    assert(h->node && h->position);
    if (!h->node || !h->position) {
        heap_destroy(H);
        return 0;
    }
    memset(h->position, 0, sizeof(t_heap_key) * (max+1));
    return 1;
}

int heap_destroy(p_heap *H) {
    p_heap h = *H;
    if (!h) return 0;
    assert(h->node && h->position);
    if (h->node) free(h->node);
    if (h->position) free(h->position);
    h->node = NULL;
    h->position = NULL;
    free(h);
    *H = NULL;
    return 1;
}

t_heap_key heap_size(p_heap *H) {
    p_heap h = *H;
    assert(h);
    return h->bottom;
}

int heap_insert(p_heap *H, t_heap_key key, t_heap_cost cost) {
    p_heap h = *H;
    assert(h);
    assert(h->bottom < h->max);
    if (h->bottom >= h->max) return 0;
    h->bottom++;
    h->node[h->bottom].key = key;
    h->node[h->bottom].cost = cost;
    assert(h->position[key] == 0);
    h->position[key] = h->bottom;
    heap_bubbleup(h, h->bottom);
    return 1;
}

t_heap_key heap_pop(p_heap *H, t_heap_cost *cost) {
    p_heap h = *H;
    t_heap_key key;
    assert(h);
    assert(h->bottom > 0);
    if (h->bottom <= 0) return 0;
    key = h->node[1].key;
    if (cost) *cost = h->node[1].cost;
    heap_swap(h, 1, h->bottom);
    h->bottom--;
    heap_bubbledown(h, 1);
    h->position[key] = 0;
    return key;
}

int heap_remove(p_heap *H, t_heap_key key) {
    p_heap h = *H;
    t_heap_key where;
    assert(h);
    assert(key <= h->max);
    where = h->position[key];
    assert(where > 0);
    assert(where <= h->bottom);
    if (where != h->bottom) { 
        heap_swap(h, where, h->bottom);
        h->bottom--;
        /* only one of these is needed 
        * running both doesn't matter, because the one that is not needed 
        * won't change anything. */
        heap_bubbledown(h, where); 
        heap_bubbleup(h, where); 
    } else h->bottom--;
    h->position[key] = 0;
    return 1;
}

t_heap_key heap_gettop(p_heap *H, t_heap_cost *cost) {
    p_heap h = *H;
    assert(h);
    assert(h->bottom > 0);
    if (cost) *cost = h->node[1].cost;
    return h->node[1].key;
}

int heap_update(p_heap *H, t_heap_key key, t_heap_cost cost) {
    p_heap h = *H;
    t_heap_key where;
    assert(h);
    assert(key <= h->max);
    where = h->position[key];
    assert(where > 0);
    assert(where <= h->bottom);
    h->node[where].cost = cost;
    heap_bubbleup(h, where); 
    heap_bubbledown(h, where);
    return 1;
}

t_heap_key heap_position(p_heap *H, t_heap_key key) {
    p_heap h = *H;
    assert(h);
    assert(key <= h->max);
    return h->position[key];
}

void heap_dump(p_heap h) {
    t_heap_key i;
    printf("h->node: ");
    for (i = 1; i <= h->bottom; i++) {
        printf("%d %d (%d), ", (int) h->node[i].key, 
            h->node[i].cost, (int) h->position[h->node[i].key]);
    }
    printf("\n");
}

static void heap_swap(p_heap h, t_heap_key i, t_heap_key j) { 
    t_heap_node temp;
    assert(i > 0 && i <= h->bottom);
    assert(j > 0 && j <= h->bottom);
    assert(h->position[h->node[i].key] == i && 
            h->position[h->node[j].key] == j);
    /* exchange values */
    temp = h->node[i]; 
    h->node[i] = h->node[j]; 
    h->node[j] = temp; 
    /* update positions */
    h->position[h->node[i].key] = i; 
    h->position[h->node[j].key] = j;
}

static void heap_bubbledown(p_heap h, t_heap_key i) {
    t_heap_key c;
loop:
    /* find first child of i */
    c = i << 1;
    /* find smallest child of i */
    if (c < h->bottom && h->node[c+1].cost < h->node[c].cost) c++;
    /* if i is bigger than its smallest child, swap them */
    if (c <= h->bottom && h->node[i].cost > h->node[c].cost) {
        heap_swap(h, i, c);
        /* heap_bubbledown(c); tail call. */
        i = c; goto loop;
    }
}

static void heap_bubbleup(p_heap h, t_heap_key i) {
    t_heap_key p;
loop:
    /* find parent of i */
    p = i >> 1;
    /* if p is bigger then i, swap them */
    if (p > 0 && h->node[i].cost < h->node[p].cost) {
        heap_swap(h, i, p);
        /* heap_bubbleup(p); tail call. */
        i = p; goto loop;
    }
}

#ifdef HEAP_STRESSTEST
#define SIZE (1024*64*4)

int main(void) {
    /* first test: 
     * sort n numbers inserted backwards and check costs with keys */
    p_heap h; 
    t_heap_key i, k;
    t_heap_cost c;
    int r;
    r = heap_create(&h, SIZE);
    assert(r);
    assert(h); 
    fprintf(stderr, "sorting: ");
    for (i = 0; i < SIZE; i++) {
        r = heap_insert(&h, SIZE-i-1, (t_heap_cost) (SIZE-i-1));
        assert(r);
    }
    for (i = 0; i < SIZE; i++) {
        assert(heap_size(&h) == SIZE-i);
        k = heap_pop(&h, &c); 
        assert(c == (t_heap_cost) k);
        assert(i == k);
    }
    assert(heap_size(&h) == 0);
    r = heap_destroy(&h); 
    assert(r);
    fprintf(stderr, "ok\n");
    /* second test: 
     * sort n numbers after removing every seventh */
    fprintf(stderr, "removal: ");
    r = heap_create(&h, SIZE);
    assert(r);
    assert(h);
    for (i = 0; i < SIZE; i++) {
        r = heap_insert(&h, SIZE-i-1, (t_heap_cost) (SIZE-i-1));
        assert(r);
    }
    for (i = 0; i < SIZE; i++) {
        if (i % 7 == 0) {
            r = heap_remove(&h, i);
            assert(r);
        }
        assert(heap_size(&h) == SIZE - i/7 - 1);
    }
    for (i = 0; i < SIZE; i++) {
        if (i % 7) {
            k = heap_gettop(&h, &c); 
            heap_pop(&h, NULL);
            assert(c == (t_heap_cost) k);
            assert(i == k);
        }
    }
    assert(heap_size(&h) == 0);
    r = heap_destroy(&h); 
    assert(r);
    fprintf(stderr, "ok\n");
    /* third test: 
     * sort n numbers after modifying all of them */
    fprintf(stderr, "update: ");
    r = heap_create(&h, SIZE);
    assert(r);
    assert(h); 
    for (i = 0; i < SIZE; i++) {
        r = heap_insert(&h, i, (t_heap_cost) i);
        assert(r);
    }
    for (i = 0; i < SIZE; i++) {
        if (i < SIZE/2) {
            r = heap_update(&h, i, (t_heap_cost) (i+SIZE/2));
            assert(r);
        } else {
            r = heap_update(&h, i, (t_heap_cost) (i-SIZE/2));
            assert(r);
        }
    }
    for (i = 0; i < SIZE; i++) {
        k = heap_pop(&h, &c);
        assert(i == c);
        if (k < SIZE/2) assert(c - SIZE/2 == (t_heap_cost) k); 
        else assert(c + SIZE/2 == (t_heap_cost) k);
    }
    assert(heap_size(&h) == 0);
    r = heap_destroy(&h);
    assert(r);
    fprintf(stderr, "ok\n");
    return 0;
}

#endif

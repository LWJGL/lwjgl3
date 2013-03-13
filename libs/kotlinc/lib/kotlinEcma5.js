'use strict';var Kotlin = Object.create(null);
(function() {
  function g() {
    return function b() {
      var c = Object.create(b.proto), d = b.initializer;
      null != d && (0 == d.length ? d.call(c) : d.apply(c, arguments));
      Object.seal(c);
      return c
    }
  }
  function h(a, b) {
    for(var c = null, d = 0, g = a.length;d < g;d++) {
      var e = a[d], f = e.proto;
      null === f || null === e.properties || (null === c ? c = Object.create(f, b || void 0) : Object.defineProperties(c, e.properties))
    }
    return c
  }
  function e(a, b, c, d) {
    var e;
    null === a ? (e = null, a = !d && null === c ? null : Object.create(null, c || void 0)) : Array.isArray(a) ? (e = a[0].initializer, a = h(a, c), null === a && d && (a = Object.create(null, c || void 0))) : (e = a.initializer, a = !d && null === c ? a.proto : Object.create(a.proto, c || void 0));
    var f = g();
    Object.defineProperty(f, "proto", {value:a});
    Object.defineProperty(f, "properties", {value:c || null});
    d && (Object.defineProperty(f, "initializer", {value:b}), Object.defineProperty(b, "baseInitializer", {value:e}), Object.freeze(b));
    Object.freeze(f);
    return f
  }
  function f(a, b) {
    return function() {
      if(null !== b) {
        var c = b;
        b = null;
        c.call(a);
        Object.seal(a)
      }
      return a
    }
  }
  Kotlin.argumentsToArrayLike = function(a) {
    return a
  };
  Kotlin.keys = Object.keys;
  Kotlin.isType = function(a, b) {
    return null === a || void 0 === a ? !1 : Object.getPrototypeOf(a) == b.proto ? !0 : !1
  };
  Kotlin.createTrait = function(a, b) {
    return e(a, null, b, !1)
  };
  Kotlin.createClass = function(a, b, c) {
    return e(a, null === b ? function() {
    } : b, c, !0)
  };
  Kotlin.createObject = function(a, b, c) {
    c = Object.create(null === a ? null : Array.isArray(a) ? h(a, c) : a.proto, c || void 0);
    null !== b && (null !== a && Object.defineProperty(b, "baseInitializer", {value:Array.isArray(a) ? a[0].initializer : a.initializer}), b.call(c));
    Object.seal(c);
    return c
  };
  Kotlin.definePackage = function(a, b) {
    var c = Object.create(null, null === b ? void 0 : b);
    if(null === a) {
      return{value:c}
    }
    c = f(c, a);
    Object.freeze(c);
    return{get:c}
  };
  Kotlin.$new = function(a) {
    return a
  };
  Kotlin.$createClass = function(a, b) {
    null !== a && "function" != typeof a && (b = a, a = null);
    var c = null, d = b ? {} : null;
    if(null != d) {
      for(var e = Object.getOwnPropertyNames(b), f = 0, g = e.length;f < g;f++) {
        var h = e[f], i = b[h];
        if("initialize" == h) {
          c = i
        }else {
          if(0 === h.indexOf("get_")) {
            var k = h.substring(4);
            d.hasOwnProperty(k) || (d[k] = {get:i}, d[h] = {value:i})
          }else {
            0 === h.indexOf("set_") ? (d[h.substring(4)] = {set:i}, d[h] = {value:i}) : d[h] = {value:i, writable:!0}
          }
        }
      }
    }
    return Kotlin.createClass(a || null, c, d)
  };
  Kotlin.defineModule = function(a, b) {
    if(a in Kotlin.modules) {
      throw Kotlin.$new(Kotlin.IllegalArgumentException)();
    }
    Object.freeze(b);
    Object.defineProperty(Kotlin.modules, a, {value:b})
  }
})();
String.prototype.startsWith = function(g) {
  return 0 === this.indexOf(g)
};
String.prototype.endsWith = function(g) {
  return-1 !== this.indexOf(g, this.length - g.length)
};
String.prototype.contains = function(g) {
  return-1 !== this.indexOf(g)
};
var kotlin = {set:function(g, h, e) {
  return g.put(h, e)
}};
(function() {
  function g(a) {
    return function() {
      throw new TypeError(void 0 !== a ? "Function " + a + " is abstract" : "Function is abstract");
    }
  }
  Kotlin.equals = function(a, b) {
    if(null === a || void 0 === a) {
      return null === b
    }
    if(a instanceof Array) {
      if(!(b instanceof Array) || a.length != b.length) {
        return!1
      }
      for(var c = 0;c < a.length;c++) {
        if(!Kotlin.equals(a[c], b[c])) {
          return!1
        }
      }
      return!0
    }
    return"object" == typeof a && void 0 !== a.equals ? a.equals(b) : a === b
  };
  Kotlin.array = function(a) {
    return null === a || void 0 === a ? [] : a.slice()
  };
  Kotlin.intUpto = function(a, b) {
    return Kotlin.$new(Kotlin.NumberRange)(a, b)
  };
  Kotlin.intDownto = function(a, b) {
    return Kotlin.$new(Kotlin.Progression)(a, b, -1)
  };
  Kotlin.modules = {};
  Kotlin.Exception = Kotlin.$createClass();
  Kotlin.RuntimeException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IndexOutOfBounds = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.NullPointerException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.NoSuchElementException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IllegalArgumentException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IllegalStateException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IndexOutOfBoundsException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.UnsupportedOperationException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IOException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.throwNPE = function() {
    throw Kotlin.$new(Kotlin.NullPointerException)();
  };
  Kotlin.Iterator = Kotlin.$createClass({initialize:function() {
  }, next:g("Iterator#next"), hasNext:g("Iterator#hasNext")});
  var h = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(a) {
    this.array = a;
    this.size = a.length;
    this.index = 0
  }, next:function() {
    return this.array[this.index++]
  }, get_hasNext:function() {
    return this.index < this.size
  }, hasNext:function() {
    return this.index < this.size
  }}), e = Kotlin.$createClass(h, {initialize:function(a) {
    this.list = a;
    this.size = a.size();
    this.index = 0
  }, next:function() {
    return this.list.get(this.index++)
  }, get_hasNext:function() {
    return this.index < this.size
  }});
  Kotlin.Collection = Kotlin.$createClass();
  Kotlin.AbstractList = Kotlin.$createClass(Kotlin.Collection, {iterator:function() {
    return Kotlin.$new(e)(this)
  }, isEmpty:function() {
    return 0 === this.size()
  }, addAll:function(a) {
    for(var a = a.iterator(), b = this.$size;0 < b--;) {
      this.add(a.next())
    }
  }, remove:function(a) {
    a = this.indexOf(a);
    -1 !== a && this.removeAt(a)
  }, contains:function(a) {
    return-1 !== this.indexOf(a)
  }, equals:function(a) {
    if(this.$size === a.$size) {
      for(var b = this.iterator(), a = a.iterator(), c = this.$size;0 < c--;) {
        if(!Kotlin.equals(b.next(), a.next())) {
          return!1
        }
      }
    }
    return!0
  }, toString:function() {
    for(var a = "[", b = this.iterator(), c = !0, d = this.$size;0 < d--;) {
      c ? c = !1 : a += ", ", a += b.next()
    }
    return a + "]"
  }, toJSON:function() {
    return this.toArray()
  }});
  Kotlin.ArrayList = Kotlin.$createClass(Kotlin.AbstractList, {initialize:function() {
    this.array = [];
    this.$size = 0
  }, get:function(a) {
    if(0 > a || a >= this.$size) {
      throw Kotlin.IndexOutOfBounds;
    }
    return this.array[a]
  }, set:function(a, b) {
    if(0 > a || a >= this.$size) {
      throw Kotlin.IndexOutOfBounds;
    }
    this.array[a] = b
  }, toArray:function() {
    return this.array.slice(0, this.$size)
  }, size:function() {
    return this.$size
  }, iterator:function() {
    return Kotlin.arrayIterator(this.array)
  }, add:function(a) {
    this.array[this.$size++] = a
  }, addAt:function(a, b) {
    this.array.splice(a, 0, b);
    this.$size++
  }, addAll:function(a) {
    for(var b = a.iterator(), c = this.$size, d = a.size();0 < d--;) {
      this.array[c++] = b.next()
    }
    this.$size += a.size()
  }, removeAt:function(a) {
    this.array.splice(a, 1);
    this.$size--
  }, clear:function() {
    this.$size = this.array.length = 0
  }, indexOf:function(a) {
    for(var b = 0, c = this.$size;b < c;++b) {
      if(Kotlin.equals(this.array[b], a)) {
        return b
      }
    }
    return-1
  }, toString:function() {
    return"[" + this.array.join(", ") + "]"
  }, toJSON:function() {
    return this.array
  }});
  Kotlin.Runnable = Kotlin.$createClass({initialize:function() {
  }, run:g("Runnable#run")});
  Kotlin.Comparable = Kotlin.$createClass({initialize:function() {
  }, compareTo:g("Comparable#compareTo")});
  Kotlin.Appendable = Kotlin.$createClass({initialize:function() {
  }, append:g("Appendable#append")});
  Kotlin.Closeable = Kotlin.$createClass({initialize:function() {
  }, close:g("Closeable#close")});
  Kotlin.parseInt = function(a) {
    return parseInt(a, 10)
  };
  Kotlin.safeParseInt = function(a) {
    a = parseInt(a, 10);
    return isNaN(a) ? null : a
  };
  Kotlin.safeParseDouble = function(a) {
    a = parseFloat(a);
    return isNaN(a) ? null : a
  };
  Kotlin.System = function() {
    var a = "", b = function(b) {
      void 0 !== b && (a = null === b || "object" !== typeof b ? a + b : a + b.toString())
    }, c = function(b) {
      this.print(b);
      a += "\n"
    };
    return{out:function() {
      return{print:b, println:c}
    }, output:function() {
      return a
    }, flush:function() {
      a = ""
    }}
  }();
  Kotlin.println = function(a) {
    Kotlin.System.out().println(a)
  };
  Kotlin.print = function(a) {
    Kotlin.System.out().print(a)
  };
  Kotlin.RangeIterator = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(a, b, c) {
    this.$start = a;
    this.$end = b;
    this.$increment = c;
    this.$i = a
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_i:function() {
    return this.$i
  }, set_i:function(a) {
    this.$i = a
  }, next:function() {
    var a = this.$i;
    this.set_i(this.$i + this.$increment);
    return a
  }, get_hasNext:function() {
    return 0 < this.$increment ? this.$next <= this.$end : this.$next >= this.$end
  }});
  Kotlin.NumberRange = Kotlin.$createClass({initialize:function(a, b) {
    this.$start = a;
    this.$end = b
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_increment:function() {
    return 1
  }, contains:function(a) {
    return this.$start <= a && a <= this.$end
  }, iterator:function() {
    return Kotlin.$new(Kotlin.RangeIterator)(this.get_start(), this.get_end())
  }});
  Kotlin.Progression = Kotlin.$createClass({initialize:function(a, b, c) {
    this.$start = a;
    this.$end = b;
    this.$increment = c
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_increment:function() {
    return this.$increment
  }, iterator:function() {
    return Kotlin.$new(Kotlin.RangeIterator)(this.get_start(), this.get_end(), this.get_increment())
  }});
  Kotlin.Comparator = Kotlin.$createClass({initialize:function() {
  }, compare:g("Comparator#compare")});
  var f = Kotlin.$createClass(Kotlin.Comparator, {initialize:function(a) {
    this.compare = a
  }});
  Kotlin.comparator = function(a) {
    return Kotlin.$new(f)(a)
  };
  Kotlin.collectionsMax = function(a, b) {
    var c = a.iterator();
    if(a.isEmpty()) {
      throw Kotlin.Exception();
    }
    for(var d = c.next();c.get_hasNext();) {
      var e = c.next();
      0 > b.compare(d, e) && (d = e)
    }
    return d
  };
  Kotlin.collectionsSort = function(a, b) {
    var c = void 0;
    void 0 !== b && (c = b.compare.bind(b));
    a instanceof Array && a.sort(c);
    for(var d = [], e = a.iterator();e.hasNext();) {
      d.push(e.next())
    }
    d.sort(c);
    c = 0;
    for(e = d.length;c < e;c++) {
      a.set(c, d[c])
    }
  };
  Kotlin.StringBuilder = Kotlin.$createClass({initialize:function() {
    this.string = ""
  }, append:function(a) {
    this.string += a.toString()
  }, toString:function() {
    return this.string
  }});
  Kotlin.splitString = function(a, b) {
    return a.split(b)
  };
  Kotlin.nullArray = function(a) {
    for(var b = [];0 < a;) {
      b[--a] = null
    }
    return b
  };
  Kotlin.arrayFromFun = function(a, b) {
    for(var c = Array(a), d = 0;d < a;d++) {
      c[d] = b(d)
    }
    return c
  };
  Kotlin.arrayIndices = function(a) {
    return Kotlin.$new(Kotlin.NumberRange)(0, a.length - 1)
  };
  Kotlin.arrayIterator = function(a) {
    return Kotlin.$new(h)(a)
  };
  Kotlin.toString = function(a) {
    return a.toString()
  };
  Kotlin.jsonFromTuples = function(a) {
    for(var b = a.length, c = {};0 < b;) {
      --b, c[a[b][0]] = a[b][1]
    }
    return c
  };
  Kotlin.jsonSet = function(a, b, c) {
    a[b] = c
  };
  Kotlin.jsonGet = function(a, b) {
    return a[b]
  };
  Kotlin.jsonAddProperties = function(a, b) {
    for(var c in b) {
      b.hasOwnProperty(c) && (a[c] = b[c])
    }
    return a
  };
  Kotlin.sure = function(a) {
    return a
  };
  Kotlin.concat = function(a, b) {
    for(var c = Array(a.length + b.length), d = 0, e = a.length;d < e;d++) {
      c[d] = a[d]
    }
    for(var e = b.length, f = 0;f < e;) {
      c[d++] = b[f++]
    }
    return c
  }
})();
Kotlin.assignOwner = function(g, h) {
  g.o = h;
  return g
};
Kotlin.b0 = function(g, h, e) {
  return function() {
    return g.call(null !== h ? h : this, e)
  }
};
Kotlin.b1 = function(g, h, e) {
  return function() {
    return g.apply(null !== h ? h : this, e)
  }
};
Kotlin.b2 = function(g, h, e) {
  return function() {
    return g.apply(null !== h ? h : this, Kotlin.concat(e, arguments))
  }
};
Kotlin.b3 = function(g, h) {
  return function() {
    return g.call(h)
  }
};
Kotlin.b4 = function(g, h) {
  return function() {
    return g.apply(h, Kotlin.argumentsToArrayLike(arguments))
  }
};
(function() {
  function g(a) {
    return"string" == typeof a ? a : typeof a.hashCode == j ? (a = a.hashCode(), "string" == typeof a ? a : g(a)) : typeof a.toString == j ? a.toString() : "" + a
  }
  function h(a, b) {
    return a.equals(b)
  }
  function e(a, b) {
    return typeof b.equals == j ? b.equals(a) : a === b
  }
  function f(a) {
    return function(b) {
      if(null === b) {
        throw Error("null is not a valid " + a);
      }
      if("undefined" == typeof b) {
        throw Error(a + " must not be undefined");
      }
    }
  }
  function a(a, b, c, d) {
    this[0] = a;
    this.entries = [];
    this.addEntry(b, c);
    null !== d && (this.getEqualityFunction = function() {
      return d
    })
  }
  function b(a) {
    return function(b) {
      for(var c = this.entries.length, d, e = this.getEqualityFunction(b);c--;) {
        if(d = this.entries[c], e(b, d[0])) {
          switch(a) {
            case i:
              return!0;
            case k:
              return d;
            case p:
              return[c, d[1]]
          }
        }
      }
      return!1
    }
  }
  function c(a) {
    return function(b) {
      for(var c = b.length, d = 0, e = this.entries.length;d < e;++d) {
        b[c + d] = this.entries[d][a]
      }
    }
  }
  function d(b, c) {
    var d = b[c];
    return d && d instanceof a ? d : null
  }
  var j = "function", n = typeof Array.prototype.splice == j ? function(a, b) {
    a.splice(b, 1)
  } : function(a, b) {
    var c, d, e;
    if(b === a.length - 1) {
      a.length = b
    }else {
      c = a.slice(b + 1);
      a.length = b;
      d = 0;
      for(e = c.length;d < e;++d) {
        a[b + d] = c[d]
      }
    }
  }, l = f("key"), o = f("value"), i = 0, k = 1, p = 2;
  a.prototype = {getEqualityFunction:function(a) {
    return typeof a.equals == j ? h : e
  }, getEntryForKey:b(k), getEntryAndIndexForKey:b(p), removeEntryForKey:function(a) {
    return(a = this.getEntryAndIndexForKey(a)) ? (n(this.entries, a[0]), a[1]) : null
  }, addEntry:function(a, b) {
    this.entries[this.entries.length] = [a, b]
  }, keys:c(0), values:c(1), getEntries:function(a) {
    for(var b = a.length, c = 0, d = this.entries.length;c < d;++c) {
      a[b + c] = this.entries[c].slice(0)
    }
  }, containsKey:b(i), containsValue:function(a) {
    for(var b = this.entries.length;b--;) {
      if(a === this.entries[b][1]) {
        return!0
      }
    }
    return!1
  }};
  var q = function(b, c) {
    var e = this, f = [], h = {}, i = typeof b == j ? b : g, k = typeof c == j ? c : null;
    this.put = function(b, c) {
      l(b);
      o(c);
      var e = i(b), g, j = null;
      (g = d(h, e)) ? (e = g.getEntryForKey(b)) ? (j = e[1], e[1] = c) : g.addEntry(b, c) : (g = new a(e, b, c, k), f[f.length] = g, h[e] = g);
      return j
    };
    this.get = function(a) {
      l(a);
      var b = i(a);
      if(b = d(h, b)) {
        if(a = b.getEntryForKey(a)) {
          return a[1]
        }
      }
      return null
    };
    this.containsKey = function(a) {
      l(a);
      var b = i(a);
      return(b = d(h, b)) ? b.containsKey(a) : !1
    };
    this.containsValue = function(a) {
      o(a);
      for(var b = f.length;b--;) {
        if(f[b].containsValue(a)) {
          return!0
        }
      }
      return!1
    };
    this.clear = function() {
      f.length = 0;
      h = {}
    };
    this.isEmpty = function() {
      return!f.length
    };
    var m = function(a) {
      return function() {
        for(var b = [], c = f.length;c--;) {
          f[c][a](b)
        }
        return b
      }
    };
    this._keys = m("keys");
    this._values = m("values");
    this._entries = m("getEntries");
    this.values = function() {
      for(var a = this._values(), b = a.length, c = Kotlin.$new(Kotlin.ArrayList)();b--;) {
        c.add(a[b])
      }
      return c
    };
    this.remove = function(a) {
      l(a);
      var b = i(a), c = null, e = d(h, b);
      if(e && (c = e.removeEntryForKey(a), null !== c && !e.entries.length)) {
        a: {
          for(a = f.length;a--;) {
            if(e = f[a], b === e[0]) {
              break a
            }
          }
          a = null
        }
        n(f, a);
        delete h[b]
      }
      return c
    };
    this.size = function() {
      for(var a = 0, b = f.length;b--;) {
        a += f[b].entries.length
      }
      return a
    };
    this.each = function(a) {
      for(var b = e._entries(), c = b.length, d;c--;) {
        d = b[c], a(d[0], d[1])
      }
    };
    this.putAll = function(a, b) {
      for(var c = a._entries(), d, f, g, h = c.length, i = typeof b == j;h--;) {
        d = c[h];
        f = d[0];
        d = d[1];
        if(i && (g = e.get(f))) {
          d = b(f, g, d)
        }
        e.put(f, d)
      }
    };
    this.clone = function() {
      var a = new q(b, c);
      a.putAll(e);
      return a
    };
    this.keySet = function() {
      for(var a = Kotlin.$new(Kotlin.HashSet)(), b = this._keys(), c = b.length;c--;) {
        a.add(b[c])
      }
      return a
    }
  };
  Kotlin.HashTable = q
})();
Kotlin.Map = Kotlin.$createClass();
Kotlin.HashMap = Kotlin.$createClass(Kotlin.Map, {initialize:function() {
  Kotlin.HashTable.call(this)
}});
Kotlin.ComplexHashMap = Kotlin.HashMap;
(function() {
  var g = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(e, f) {
    this.map = e;
    this.keys = f;
    this.size = f.length;
    this.index = 0
  }, next:function() {
    return this.map[this.keys[this.index++]]
  }, get_hasNext:function() {
    return this.index < this.size
  }}), h = Kotlin.$createClass(Kotlin.Collection, {initialize:function(e) {
    this.map = e
  }, iterator:function() {
    return Kotlin.$new(g)(this.map.map, Kotlin.keys(this.map.map))
  }, isEmpty:function() {
    return 0 === this.map.$size
  }, contains:function(e) {
    return this.map.containsValue(e)
  }});
  Kotlin.PrimitiveHashMap = Kotlin.$createClass(Kotlin.Map, {initialize:function() {
    this.$size = 0;
    this.map = {}
  }, size:function() {
    return this.$size
  }, isEmpty:function() {
    return 0 === this.$size
  }, containsKey:function(e) {
    return void 0 !== this.map[e]
  }, containsValue:function(e) {
    var f = this.map, a;
    for(a in f) {
      if(f.hasOwnProperty(a) && f[a] === e) {
        return!0
      }
    }
    return!1
  }, get:function(e) {
    return this.map[e]
  }, put:function(e, f) {
    var a = this.map[e];
    this.map[e] = void 0 === f ? null : f;
    void 0 === a && this.$size++;
    return a
  }, remove:function(e) {
    var f = this.map[e];
    void 0 !== f && (delete this.map[e], this.$size--);
    return f
  }, clear:function() {
    this.$size = 0;
    this.map = {}
  }, putAll:function() {
    throw Kotlin.$new(Kotlin.UnsupportedOperationException)();
  }, keySet:function() {
    var e = Kotlin.$new(Kotlin.HashSet)(), f = this.map, a;
    for(a in f) {
      f.hasOwnProperty(a) && e.add(a)
    }
    return e
  }, values:function() {
    return Kotlin.$new(h)(this)
  }, toJSON:function() {
    return this.map
  }})
})();
(function() {
  function g(h, e) {
    var f = new Kotlin.HashTable(h, e);
    this.add = function(a) {
      f.put(a, !0)
    };
    this.addAll = function(a) {
      for(var b = a.length;b--;) {
        f.put(a[b], !0)
      }
    };
    this.values = function() {
      return f._keys()
    };
    this.iterator = function() {
      return Kotlin.arrayIterator(this.values())
    };
    this.remove = function(a) {
      return f.remove(a) ? a : null
    };
    this.contains = function(a) {
      return f.containsKey(a)
    };
    this.clear = function() {
      f.clear()
    };
    this.size = function() {
      return f.size()
    };
    this.isEmpty = function() {
      return f.isEmpty()
    };
    this.clone = function() {
      var a = new g(h, e);
      a.addAll(f.keys());
      return a
    };
    this.equals = function(a) {
      if(null === a || void 0 === a) {
        return!1
      }
      if(this.size() === a.size()) {
        for(var b = this.iterator(), a = a.iterator();;) {
          var c = b.get_hasNext(), d = a.get_hasNext();
          if(c != d) {
            break
          }
          if(d) {
            if(c = b.next(), d = a.next(), !Kotlin.equals(c, d)) {
              break
            }
          }else {
            return!0
          }
        }
      }
      return!1
    };
    this.toString = function() {
      for(var a = "[", b = this.iterator(), c = !0;b.get_hasNext();) {
        c ? c = !1 : a += ", ", a += b.next()
      }
      return a + "]"
    };
    this.intersection = function(a) {
      for(var b = new g(h, e), a = a.values(), c = a.length, d;c--;) {
        d = a[c], f.containsKey(d) && b.add(d)
      }
      return b
    };
    this.union = function(a) {
      for(var b = this.clone(), a = a.values(), c = a.length, d;c--;) {
        d = a[c], f.containsKey(d) || b.add(d)
      }
      return b
    };
    this.isSubsetOf = function(a) {
      for(var b = f.keys(), c = b.length;c--;) {
        if(!a.contains(b[c])) {
          return!1
        }
      }
      return!0
    }
  }
  Kotlin.HashSet = Kotlin.$createClass({initialize:function() {
    g.call(this)
  }})
})();


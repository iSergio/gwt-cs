define(["./arrayRemoveDuplicates-3a9a9480","./Transforms-73e77b72","./Cartesian2-b4b7b0b3","./Check-5e798bbf","./ComponentDatatype-2da3a966","./CoplanarPolygonGeometryLibrary-6d76da75","./when-208fe5b0","./GeometryAttribute-b541caa6","./GeometryAttributes-b0b294d8","./GeometryInstance-411ead1b","./GeometryPipeline-86615bad","./IndexDatatype-3bc916b1","./PolygonGeometryLibrary-9fe00cbc","./Math-8386669c","./RuntimeError-7f634f5d","./WebGLConstants-5e2a49ab","./OrientedBoundingBox-2e9d8f93","./EllipsoidTangentPlane-69cc10ff","./AxisAlignedBoundingBox-122de82b","./IntersectionTests-40db2afa","./Plane-b91bfb59","./AttributeCompression-9711314b","./EncodedCartesian3-21af0f3b","./ArcType-dc1c5aee","./EllipsoidRhumbLine-73a4e3eb","./PolygonPipeline-b445e3f3"],function(i,y,l,e,c,p,o,s,u,d,b,m,f,t,n,r,a,g,h,P,G,v,L,C,T,E){"use strict";function k(e){e=(e=o.defaultValue(e,o.defaultValue.EMPTY_OBJECT)).polygonHierarchy;this._polygonHierarchy=e,this._workerName="createCoplanarPolygonOutlineGeometry",this.packedLength=f.PolygonGeometryLibrary.computeHierarchyPackedLength(e)+1}k.fromPositions=function(e){return new k({polygonHierarchy:{positions:(e=o.defaultValue(e,o.defaultValue.EMPTY_OBJECT)).positions}})},k.pack=function(e,t,n){return n=o.defaultValue(n,0),t[n=f.PolygonGeometryLibrary.packPolygonHierarchy(e._polygonHierarchy,t,n)]=e.packedLength,t};var A={polygonHierarchy:{}};return k.unpack=function(e,t,n){t=o.defaultValue(t,0);var r=f.PolygonGeometryLibrary.unpackPolygonHierarchy(e,t);t=r.startingIndex,delete r.startingIndex;t=e[t];return(n=!o.defined(n)?new k(A):n)._polygonHierarchy=r,n.packedLength=t,n},k.createGeometry=function(e){var t=e._polygonHierarchy,e=t.positions,e=i.arrayRemoveDuplicates(e,l.Cartesian3.equalsEpsilon,!0);if(!(e.length<3)&&p.CoplanarPolygonGeometryLibrary.validOutline(e)){var n=f.PolygonGeometryLibrary.polygonOutlinesFromHierarchy(t,!1);if(0!==n.length){for(var r=[],o=0;o<n.length;o++){var a=new d.GeometryInstance({geometry:function(e){for(var t=e.length,n=new Float64Array(3*t),r=m.IndexDatatype.createTypedArray(t,2*t),o=0,a=0,i=0;i<t;i++){var y=e[i];n[o++]=y.x,n[o++]=y.y,n[o++]=y.z,r[a++]=i,r[a++]=(i+1)%t}var l=new u.GeometryAttributes({position:new s.GeometryAttribute({componentDatatype:c.ComponentDatatype.DOUBLE,componentsPerAttribute:3,values:n})});return new s.Geometry({attributes:l,indices:r,primitiveType:s.PrimitiveType.LINES})}(n[o])});r.push(a)}e=b.GeometryPipeline.combineInstances(r)[0],t=y.BoundingSphere.fromPoints(t.positions);return new s.Geometry({attributes:e.attributes,indices:e.indices,primitiveType:e.primitiveType,boundingSphere:t})}}},function(e,t){return(e=o.defined(t)?k.unpack(e,t):e)._ellipsoid=l.Ellipsoid.clone(e._ellipsoid),k.createGeometry(e)}});

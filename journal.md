# Multimedia Management System Journal

## Phase 1: Remote Proxy & Core Interface

In this phase, I created the MediaItem interface,
RealMedia class, and RemoteMediaProxy class.

I learned how the Proxy Pattern allows a program
to interact with a real object through another
object that controls access to it.

The common interface makes it possible to use
the proxy and real media object interchangeably
without the client needing to know how the
connection works.

I also learned how to use a boolean flag to
prevent the remote proxy from connecting
multiple times.

## Phase 2: Virtual Proxy (Lazy Loading)

In this phase, I created the VirtualMediaProxy class
to simulate loading large media files only when needed.

I learned that the Remote Proxy manages access to an
existing object, while the Virtual Proxy delays creating
the real object until it is first accessed.

The biggest challenge was making sure the real media
object was only created once. I used a null check to
prevent the program from loading the same media again.

This phase helped me understand how lazy loading can
improve memory efficiency in application

## Phase 3: Validation & Reflection

In this phase, I tested the Remote Proxy and Virtual
Proxy to make sure they worked correctly.

I tested multiple users accessing different media
items and repeated calls to the same proxies.

The Remote Proxy was designed to establish its
connection only once, while the Virtual Proxy
was designed to load heavy assets only once.

Manual testing helped me understand how both
proxies control access to real objects in
different ways.

I also reviewed the code to make sure the
connection flag and lazy-loading null check
prevented unnecessary repeated operations.

Overall, this project helped me better understand
the Proxy Pattern and how it can improve resource
management in a streaming application.


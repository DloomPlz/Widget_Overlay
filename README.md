# Widget_Overlay

Little example of how to implement a widget to hide valuable information (like permissions app request)

---

The floating view mechanism are used by malicious applications to capture user interacion and deceive their vigilance.

The implementation of this type of view can be done in several ways:

- With a custom Toast displaying a view instead of text.

- With a window of type SYSTEM_ALERT. Managed by the WindowManager and LayoutParams.

- With a transparent view managed by the WindowManager, Flags and the application theme.



This project is a quick example of the custom Toast displaying a view instead of text.

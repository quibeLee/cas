package org.jasig.cas.event;

/**
 * Interface of classes that know how to handle a specific event.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 *
 */
public interface EventHandler {
    
    /**
     * Method to handle any processing of the event that
     * is needed.
     * 
     * @param event the event to handle.
     */
    void handleEvent(Event event);
    
    /**
     * Method to check if this handler will be able to process
     * the event.
     * 
     * @param event the event we want to check if we support.
     * @return true if the event is supported, false otherwise.
     */
    boolean supports(Event event);
}
